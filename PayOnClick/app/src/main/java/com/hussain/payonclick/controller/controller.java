//package com.hussain.payonclick.controller;
//
//import com.hussain.payonclick.apiset;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
///*
//
//public class controller {
//    private static final String url = "http://api.payonclick.in/Vr1.0/74536/DJKIJF09320923JSDFOJDFLMSDS/KVLKMS09232309283KJSDJLWLEEJ203/api/";
//    private static controller cliobject;
//    private static Retrofit retrofit;
//
//    controller() {
//        retrofit = new Retrofit.Builder()
//                .baseUrl(url)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//    }
//
//    public static synchronized controller getInstance() {
//        if (cliobject == null)
//            cliobject = new controller();
//        return cliobject;
//    }
//
//    public  apiset getapi() {
//       return  retrofit.create(apiset.class);
//    }
//
//}
//*/
//
//public class controller {
//    private static final String url = "http://api.payonclick.in/Vr1.0/74536/DJKIJF09320923JSDFOJDFLMSDS/KVLKMS09232309283KJSDJLWLEEJ203/api/";
//    private static controller cliobject;
//    private static Retrofit retrofit;
//
//    private controller() {
//        retrofit = new Retrofit.Builder()
//                .baseUrl(url)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//    }
//
//    public static synchronized controller getInstance() {
//        if (cliobject == null) {
//            cliobject = new controller();
//        }
//        return cliobject;
//    }
//
//    public apiset getapi() {
//        return retrofit.create(apiset.class);
//    }
//}