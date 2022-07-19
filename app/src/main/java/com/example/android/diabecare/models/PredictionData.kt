package com.example.android.diabecare.models

import androidx.databinding.ObservableField

data class PredictionData (
    var pregnancies: ObservableField<Int> = ObservableField<Int>(),
    var glucose : ObservableField<Int> = ObservableField<Int>(),
    var bloodPressure :ObservableField<Int> = ObservableField<Int>(),
    var skinThickness : ObservableField<Int> = ObservableField<Int>(),
    var insulin : ObservableField<Int> = ObservableField<Int>(),
    var bmi : ObservableField<Int> = ObservableField<Int>(),
    var diabetesPeigreeFunction : ObservableField<Int> = ObservableField<Int>(),
    )