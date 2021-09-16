package com.common.core.cache.sp.serializer;

import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Describe: json数据解析器
 * Created by lyons on 19-8-7
 */
public class GsonSerializer implements Serializer {

    private final Gson jsonSerializer;

    public GsonSerializer() { this.jsonSerializer = new Gson(); }

    @Nullable
    @Override
    public <O> String toJsonString(O obj) {
        String jsonS = null;
        try {
            jsonS = this.jsonSerializer.toJson(obj);
        } catch (Exception ignored) {}
        return jsonS;
    }

    @Nullable
    @Override
    public <O> String toJsonString(@NotNull List<? extends O> objs) {
        return this.jsonSerializer.toJson(objs);
    }

    @Nullable
    @Override
    public <O> O toObj(@NotNull String jsonString, @NotNull Class<O> clazz) {
        O o = null;
        try {
            o = this.jsonSerializer.fromJson(jsonString, clazz);
        } catch (Exception ignored) {}
        return o;
    }

    @Nullable
    @Override
    public <O> List<O> toList(@NotNull String jsonString, @NotNull Class<O> clazz) {
//        List<O> list = null;
//        try {
//            list = this.jsonSerializer.<List<O>>fromJson(jsonString, List.class);
//        } catch (Exception ignored) {}
//        return list;

        final List<O> list = new ArrayList<>();
        JSONArray jsonArray;
        try {
            jsonArray = new JSONArray(jsonString);
        } catch (JSONException e) {
            jsonArray = null;
        }
        if(null != jsonArray) {
            final Gson gson = new Gson();
            for(int i = 0; i < jsonArray.length(); i++) {
                final O o = gson.fromJson(jsonArray.optString(i), clazz);
                if(null != o) list.add(o);
            }
        }
        return list;
    }
}
