package com.example.android.diabecare.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003Jy\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0004H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f\u00a8\u0006*"}, d2 = {"Lcom/example/android/diabecare/models/PredictionData;", "", "pregnancies", "Landroidx/databinding/ObservableField;", "", "glucose", "bloodPressure", "skinThickness", "insulin", "bmi", "diabetesPeigreeFunction", "(Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;Landroidx/databinding/ObservableField;)V", "getBloodPressure", "()Landroidx/databinding/ObservableField;", "setBloodPressure", "(Landroidx/databinding/ObservableField;)V", "getBmi", "setBmi", "getDiabetesPeigreeFunction", "setDiabetesPeigreeFunction", "getGlucose", "setGlucose", "getInsulin", "setInsulin", "getPregnancies", "setPregnancies", "getSkinThickness", "setSkinThickness", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class PredictionData {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> pregnancies;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> glucose;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> bloodPressure;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> skinThickness;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> insulin;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> bmi;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> diabetesPeigreeFunction;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.diabecare.models.PredictionData copy(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> pregnancies, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> glucose, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> bloodPressure, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> skinThickness, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> insulin, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> bmi, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> diabetesPeigreeFunction) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PredictionData() {
        super();
    }
    
    public PredictionData(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> pregnancies, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> glucose, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> bloodPressure, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> skinThickness, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> insulin, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> bmi, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> diabetesPeigreeFunction) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getPregnancies() {
        return null;
    }
    
    public final void setPregnancies(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getGlucose() {
        return null;
    }
    
    public final void setGlucose(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getBloodPressure() {
        return null;
    }
    
    public final void setBloodPressure(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getSkinThickness() {
        return null;
    }
    
    public final void setSkinThickness(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getInsulin() {
        return null;
    }
    
    public final void setInsulin(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getBmi() {
        return null;
    }
    
    public final void setBmi(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getDiabetesPeigreeFunction() {
        return null;
    }
    
    public final void setDiabetesPeigreeFunction(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
}