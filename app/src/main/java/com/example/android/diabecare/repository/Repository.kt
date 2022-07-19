package com.example.android.diabecare.repository

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.android.diabecare.api.PredictionApi
import com.example.android.diabecare.models.PredictionResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Field

class Repository{
    val result = MutableLiveData<String>()


    fun getPredictionFromRepository(
        @Field("Pregnancies") preg: Int,
        @Field("Glucose") glu: Int,
        @Field("Insulin") ins: Int,
        @Field("BloodPressure") bp: Int,
        @Field("SkinThickness") sknt: Int,
        @Field("BMI") bmi: Int,
        @Field("DiabetesPedigreeFunction") dpf: Int,
        @Field("Age") age: Int,
    ): MutableLiveData<String> {

        PredictionApi.invoke().getPredictionFromAPI(preg,glu,bp,sknt,ins,bmi,dpf,age).enqueue(object :
            Callback<PredictionResult> {
            override fun onResponse(call: Call<PredictionResult>, response: Response<PredictionResult>) {
                    if(response.isSuccessful){
                        result.value = response.body()?.risk
                    }
            }
            override fun onFailure(call: Call<PredictionResult>, t: Throwable) {
                Log.d("hello", "onFailure: failed to get todo");
            }

        })
        return result
    }

}