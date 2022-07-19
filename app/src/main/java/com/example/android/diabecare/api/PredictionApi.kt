package com.example.android.diabecare.api

import androidx.lifecycle.MutableLiveData
import com.example.android.diabecare.models.PredictionData
import com.example.android.diabecare.models.PredictionResult
import kotlinx.coroutines.Deferred
import okhttp3.ConnectionSpec
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


interface PredictionApi {
    @FormUrlEncoded
    @POST("/predict")
    @Headers("Content-Type:application/x-www-form-urlencoded")
    fun getPredictionFromAPI(@Field("Pregnancies") preg: Int,
                             @Field("Glucose") glu: Int,
                             @Field("Insulin") ins: Int,
                             @Field("BloodPressure") bp: Int,
                             @Field("SkinThickness") sknt: Int,
                             @Field("BMI") bmi: Int,
                             @Field("DiabetesPedigreeFunction") dpf: Int,
                             @Field("Age") age: Int
    ): Call<PredictionResult>


    companion object RetrofitInstance {

        private val client = OkHttpClient.Builder()
            .connectionSpecs(listOf(ConnectionSpec.CLEARTEXT,ConnectionSpec.MODERN_TLS) )
            .build()

        operator fun invoke(): PredictionApi {
                return Retrofit.Builder()
                    .baseUrl("http://ec2-3-6-124-224.ap-south-1.compute.amazonaws.com:8080")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build().create(PredictionApi::class.java)
        }
    }
}