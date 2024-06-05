
package fr.univtours.polytech.bookshop.model.books;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "numFound",
        "start",
        "numFoundExact",
        "docs"
})
@Generated("jsonschema2pojo")
public class BookShopResult {

    @JsonProperty("numFound")
    private Integer numFound;
    @JsonProperty("start")
    private Integer start;
    @JsonProperty("numFoundExact")
    private Boolean numFoundExact;
    @JsonProperty("docs")
    private List<Doc> docs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("numFound")
    public Integer getNumFound() {
        return numFound;
    }

    @JsonProperty("numFound")
    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Integer start) {
        this.start = start;
    }

    @JsonProperty("numFoundExact")
    public Boolean getNumFoundExact() {
        return numFoundExact;
    }

    @JsonProperty("numFoundExact")
    public void setNumFoundExact(Boolean numFoundExact) {
        this.numFoundExact = numFoundExact;
    }

    @JsonProperty("docs")
    public List<Doc> getDocs() {
        return docs;
    }

    @JsonProperty("docs")
    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
