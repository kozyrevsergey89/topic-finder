package com.callisto.bft.utils;

import com.facebook.android.Facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class AppUtils {

    private static final String TOKEN = "access_token";
    private static final String EXPIRES = "expires_in";
    private static final String LAST_UPDATE = "last_update";
    private static final String KEY = "facebook-session";

    public static boolean saveToken(Facebook session, Context context) {
        Editor editor = context.getSharedPreferences(KEY, Context.MODE_PRIVATE).edit();
        editor.putString(TOKEN, session.getAccessToken());
        editor.putLong(EXPIRES, session.getAccessExpires());
        editor.putLong(LAST_UPDATE, session.getLastAccessUpdate());
        return editor.commit();
    }

    public static boolean restoreToken(Facebook session, Context context) {
        SharedPreferences savedSession = context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
        session.setTokenFromCache(
                savedSession.getString(TOKEN, null),
                savedSession.getLong(EXPIRES, 0),
                savedSession.getLong(LAST_UPDATE, 0));
        return session.isSessionValid();
    }

    public static void clear(Context context) {
        Editor editor = context.getSharedPreferences(KEY, Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }

}
