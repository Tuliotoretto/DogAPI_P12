package dgtic.unam.dogapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ServiceApi {
    @GET
    suspend fun getBreedByDogs(@Url url: String): Response<ModeloDog>
}