package com.example.android.diabecare.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ^\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/android/diabecare/api/PredictionApi;", "", "getPredictionFromAPI", "Lretrofit2/Call;", "Lcom/example/android/diabecare/models/PredictionResult;", "preg", "", "glu", "ins", "bp", "sknt", "bmi", "dpf", "age", "RetrofitInstance", "app_debug"})
public abstract interface PredictionApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.diabecare.api.PredictionApi.RetrofitInstance RetrofitInstance = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Content-Type:application/x-www-form-urlencoded"})
    @retrofit2.http.POST(value = "/predict")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<com.example.android.diabecare.models.PredictionResult> getPredictionFromAPI(@retrofit2.http.Field(value = "Pregnancies")
    int preg, @retrofit2.http.Field(value = "Glucose")
    int glu, @retrofit2.http.Field(value = "Insulin")
    int ins, @retrofit2.http.Field(value = "BloodPressure")
    int bp, @retrofit2.http.Field(value = "SkinThickness")
    int sknt, @retrofit2.http.Field(value = "BMI")
    int bmi, @retrofit2.http.Field(value = "DiabetesPedigreeFunction")
    int dpf, @retrofit2.http.Field(value = "Age")
    int age);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0005\u001a\u00020\u0006H\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/diabecare/api/PredictionApi$RetrofitInstance;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "invoke", "Lcom/example/android/diabecare/api/PredictionApi;", "app_debug"})
    public static final class RetrofitInstance {
        private static final okhttp3.OkHttpClient client = null;
        
        private RetrofitInstance() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.android.diabecare.api.PredictionApi invoke() {
            return null;
        }
    }
}