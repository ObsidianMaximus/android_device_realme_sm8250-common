package com.oplus.util;

import android.content.res.OplusBaseConfiguration;

public class OplusTypeCastingHelper {
    
    public OplusTypeCastingHelper() {}
    public static OplusBaseConfiguration typeCasting(Class<OplusBaseConfiguration> configuration, Object context) {
        return (OplusBaseConfiguration)context;
    }
}