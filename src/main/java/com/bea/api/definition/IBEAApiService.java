package com.bea.api.definition;

import retrofit.http.GET;
import retrofit.http.Query;

import com.bea.api.objects.Results;
import com.bea.helpers.KeyCodeCollection;

public interface IBEAApiService
{

	@GET("/data")
	Results getDataResults(
			@Query("UserID") String userID,
			@Query("method") String method,
			@Query("datasetname") String datasetname,
			@Query("KeyCode") String keyCode,
			@Query("ResultFormat") String resultFormat);
	
	@GET("/data")
	KeyCodeCollection getKeyCodes(
			@Query("UserID") String userID,
			@Query("method") String method,
			@Query("datasetname") String datasetname,
			@Query("ParameterName") String parameterName,
			@Query("ResultFormat") String resultFormat);
}