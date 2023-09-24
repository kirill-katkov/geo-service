package guru.qa.geoservice.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record GeoJson(

	@JsonProperty("features")
	List<CountryJson> features
) {
}