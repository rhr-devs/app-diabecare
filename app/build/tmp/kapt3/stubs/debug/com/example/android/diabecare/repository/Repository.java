package com.example.android.diabecare.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\\\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/android/diabecare/repository/Repository;", "", "()V", "result", "Landroidx/lifecycle/MutableLiveData;", "", "getResult", "()Landroidx/lifecycle/MutableLiveData;", "getPredictionFromRepository", "preg", "", "glu", "ins", "bp", "sknt", "bmi", "dpf", "age", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> result = null;
    
    public Repository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPredictionFromRepository(@retrofit2.http.Field(value = "Pregnancies")
    int preg, @retrofit2.http.Field(value = "Glucose")
    int glu, @retrofit2.http.Field(value = "Insulin")
    int ins, @retrofit2.http.Field(value = "BloodPressure")
    int bp, @retrofit2.http.Field(value = "SkinThickness")
    int sknt, @retrofit2.http.Field(value = "BMI")
    int bmi, @retrofit2.http.Field(value = "DiabetesPedigreeFunction")
    int dpf, @retrofit2.http.Field(value = "Age")
    int age) {
        return null;
    }
}