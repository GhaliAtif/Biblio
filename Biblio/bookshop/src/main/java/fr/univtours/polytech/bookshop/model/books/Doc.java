
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
    "author_alternative_name",
    "author_key",
    "author_name",
    "contributor",
    "cover_edition_key",
    "cover_i",
    "ddc",
    "ebook_access",
    "ebook_count_i",
    "edition_count",
    "edition_key",
    "first_publish_year",
    "first_sentence",
    "format",
    "has_fulltext",
    "ia",
    "ia_collection",
    "ia_collection_s",
    "isbn",
    "key",
    "language",
    "last_modified_i",
    "lcc",
    "lccn",
    "lending_edition_s",
    "lending_identifier_s",
    "number_of_pages_median",
    "oclc",
    "osp_count",
    "printdisabled_s",
    "public_scan_b",
    "publish_date",
    "publish_place",
    "publish_year",
    "publisher",
    "seed",
    "title",
    "title_suggest",
    "title_sort",
    "type",
    "id_amazon",
    "id_better_world_books",
    "id_goodreads",
    "id_librarything",
    "id_google",
    "id_scribd",
    "id_amazon_de_asin",
    "id_alibris_id",
    "id_nla",
    "id_amazon_ca_asin",
    "id_overdrive",
    "id_hathi_trust",
    "id_amazon_it_asin",
    "id_paperback_swap",
    "id_british_national_bibliography",
    "id_british_library",
    "id_biblioth\u00e8que_nationale_de_france",
    "id_amazon_co_uk_asin",
    "id_bcid",
    "subject",
    "place",
    "person",
    "ia_loaded_id",
    "ia_box_id",
    "ratings_average",
    "ratings_sortable",
    "ratings_count",
    "ratings_count_1",
    "ratings_count_2",
    "ratings_count_3",
    "ratings_count_4",
    "ratings_count_5",
    "readinglog_count",
    "want_to_read_count",
    "currently_reading_count",
    "already_read_count",
    "publisher_facet",
    "person_key",
    "place_key",
    "person_facet",
    "subject_facet",
    "_version_",
    "place_facet",
    "lcc_sort",
    "author_facet",
    "subject_key",
    "ddc_sort"
})
@Generated("jsonschema2pojo")
public class Doc {

    @JsonProperty("author_alternative_name")
    private List<String> authorAlternativeName;
    @JsonProperty("author_key")
    private List<String> authorKey;
    @JsonProperty("author_name")
    private List<String> authorName;
    @JsonProperty("contributor")
    private List<String> contributor;
    @JsonProperty("cover_edition_key")
    private String coverEditionKey;
    @JsonProperty("cover_i")
    private Integer coverI;
    @JsonProperty("ddc")
    private List<String> ddc;
    @JsonProperty("ebook_access")
    private String ebookAccess;
    @JsonProperty("ebook_count_i")
    private Integer ebookCountI;
    @JsonProperty("edition_count")
    private Integer editionCount;
    @JsonProperty("edition_key")
    private List<String> editionKey;
    @JsonProperty("first_publish_year")
    private Integer firstPublishYear;
    @JsonProperty("first_sentence")
    private List<String> firstSentence;
    @JsonProperty("format")
    private List<String> format;
    @JsonProperty("has_fulltext")
    private Boolean hasFulltext;
    @JsonProperty("ia")
    private List<String> ia;
    @JsonProperty("ia_collection")
    private List<String> iaCollection;
    @JsonProperty("ia_collection_s")
    private String iaCollectionS;
    @JsonProperty("isbn")
    private List<String> isbn;
    @JsonProperty("key")
    private String key;
    @JsonProperty("language")
    private List<String> language;
    @JsonProperty("last_modified_i")
    private Integer lastModifiedI;
    @JsonProperty("lcc")
    private List<String> lcc;
    @JsonProperty("lccn")
    private List<String> lccn;
    @JsonProperty("lending_edition_s")
    private String lendingEditionS;
    @JsonProperty("lending_identifier_s")
    private String lendingIdentifierS;
    @JsonProperty("number_of_pages_median")
    private Integer numberOfPagesMedian;
    @JsonProperty("oclc")
    private List<String> oclc;
    @JsonProperty("osp_count")
    private Integer ospCount;
    @JsonProperty("printdisabled_s")
    private String printdisabledS;
    @JsonProperty("public_scan_b")
    private Boolean publicScanB;
    @JsonProperty("publish_date")
    private List<String> publishDate;
    @JsonProperty("publish_place")
    private List<String> publishPlace;
    @JsonProperty("publish_year")
    private List<Integer> publishYear;
    @JsonProperty("publisher")
    private List<String> publisher;
    @JsonProperty("seed")
    private List<String> seed;
    @JsonProperty("title")
    private String title;
    @JsonProperty("title_suggest")
    private String titleSuggest;
    @JsonProperty("title_sort")
    private String titleSort;
    @JsonProperty("type")
    private String type;
    @JsonProperty("id_amazon")
    private List<String> idAmazon;
    @JsonProperty("id_better_world_books")
    private List<String> idBetterWorldBooks;
    @JsonProperty("id_goodreads")
    private List<String> idGoodreads;
    @JsonProperty("id_librarything")
    private List<String> idLibrarything;
    @JsonProperty("id_google")
    private List<String> idGoogle;
    @JsonProperty("id_scribd")
    private List<String> idScribd;
    @JsonProperty("id_amazon_de_asin")
    private List<String> idAmazonDeAsin;
    @JsonProperty("id_alibris_id")
    private List<String> idAlibrisId;
    @JsonProperty("id_nla")
    private List<String> idNla;
    @JsonProperty("id_amazon_ca_asin")
    private List<String> idAmazonCaAsin;
    @JsonProperty("id_overdrive")
    private List<String> idOverdrive;
    @JsonProperty("id_hathi_trust")
    private List<String> idHathiTrust;
    @JsonProperty("id_amazon_it_asin")
    private List<String> idAmazonItAsin;
    @JsonProperty("id_paperback_swap")
    private List<String> idPaperbackSwap;
    @JsonProperty("id_british_national_bibliography")
    private List<String> idBritishNationalBibliography;
    @JsonProperty("id_british_library")
    private List<String> idBritishLibrary;
    @JsonProperty("id_biblioth\u00e8que_nationale_de_france")
    private List<String> idBibliothQueNationaleDeFrance;
    @JsonProperty("id_amazon_co_uk_asin")
    private List<String> idAmazonCoUkAsin;
    @JsonProperty("id_bcid")
    private List<String> idBcid;
    @JsonProperty("subject")
    private List<String> subject;
    @JsonProperty("place")
    private List<String> place;
    @JsonProperty("person")
    private List<String> person;
    @JsonProperty("ia_loaded_id")
    private List<String> iaLoadedId;
    @JsonProperty("ia_box_id")
    private List<String> iaBoxId;
    @JsonProperty("ratings_average")
    private Double ratingsAverage;
    @JsonProperty("ratings_sortable")
    private Double ratingsSortable;
    @JsonProperty("ratings_count")
    private Integer ratingsCount;
    @JsonProperty("ratings_count_1")
    private Integer ratingsCount1;
    @JsonProperty("ratings_count_2")
    private Integer ratingsCount2;
    @JsonProperty("ratings_count_3")
    private Integer ratingsCount3;
    @JsonProperty("ratings_count_4")
    private Integer ratingsCount4;
    @JsonProperty("ratings_count_5")
    private Integer ratingsCount5;
    @JsonProperty("readinglog_count")
    private Integer readinglogCount;
    @JsonProperty("want_to_read_count")
    private Integer wantToReadCount;
    @JsonProperty("currently_reading_count")
    private Integer currentlyReadingCount;
    @JsonProperty("already_read_count")
    private Integer alreadyReadCount;
    @JsonProperty("publisher_facet")
    private List<String> publisherFacet;
    @JsonProperty("person_key")
    private List<String> personKey;
    @JsonProperty("place_key")
    private List<String> placeKey;
    @JsonProperty("person_facet")
    private List<String> personFacet;
    @JsonProperty("subject_facet")
    private List<String> subjectFacet;
    @JsonProperty("_version_")
    private Long version;
    @JsonProperty("place_facet")
    private List<String> placeFacet;
    @JsonProperty("lcc_sort")
    private String lccSort;
    @JsonProperty("author_facet")
    private List<String> authorFacet;
    @JsonProperty("subject_key")
    private List<String> subjectKey;
    @JsonProperty("ddc_sort")
    private String ddcSort;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("author_alternative_name")
    public List<String> getAuthorAlternativeName() {
        return authorAlternativeName;
    }

    @JsonProperty("author_alternative_name")
    public void setAuthorAlternativeName(List<String> authorAlternativeName) {
        this.authorAlternativeName = authorAlternativeName;
    }

    @JsonProperty("author_key")
    public List<String> getAuthorKey() {
        return authorKey;
    }

    @JsonProperty("author_key")
    public void setAuthorKey(List<String> authorKey) {
        this.authorKey = authorKey;
    }

    @JsonProperty("author_name")
    public List<String> getAuthor_name() {
        return authorName;
    }

    @JsonProperty("author_name")
    public void setAuthorName(List<String> authorName) {
        this.authorName = authorName;
    }

    @JsonProperty("contributor")
    public List<String> getContributor() {
        return contributor;
    }

    @JsonProperty("contributor")
    public void setContributor(List<String> contributor) {
        this.contributor = contributor;
    }

    @JsonProperty("cover_edition_key")
    public String getCoverEditionKey() {
        return coverEditionKey;
    }

    @JsonProperty("cover_edition_key")
    public void setCoverEditionKey(String coverEditionKey) {
        this.coverEditionKey = coverEditionKey;
    }

    @JsonProperty("cover_i")
    public Integer getCoverI() {
        return coverI;
    }

    @JsonProperty("cover_i")
    public void setCoverI(Integer coverI) {
        this.coverI = coverI;
    }

    @JsonProperty("ddc")
    public List<String> getDdc() {
        return ddc;
    }

    @JsonProperty("ddc")
    public void setDdc(List<String> ddc) {
        this.ddc = ddc;
    }

    @JsonProperty("ebook_access")
    public String getEbookAccess() {
        return ebookAccess;
    }

    @JsonProperty("ebook_access")
    public void setEbookAccess(String ebookAccess) {
        this.ebookAccess = ebookAccess;
    }

    @JsonProperty("ebook_count_i")
    public Integer getEbookCountI() {
        return ebookCountI;
    }

    @JsonProperty("ebook_count_i")
    public void setEbookCountI(Integer ebookCountI) {
        this.ebookCountI = ebookCountI;
    }

    @JsonProperty("edition_count")
    public Integer getEditionCount() {
        return editionCount;
    }

    @JsonProperty("edition_count")
    public void setEditionCount(Integer editionCount) {
        this.editionCount = editionCount;
    }

    @JsonProperty("edition_key")
    public List<String> getEditionKey() {
        return editionKey;
    }

    @JsonProperty("edition_key")
    public void setEditionKey(List<String> editionKey) {
        this.editionKey = editionKey;
    }

    @JsonProperty("first_publish_year")
    public Integer getFirstPublishYear() {
        return firstPublishYear;
    }

    @JsonProperty("first_publish_year")
    public void setFirstPublishYear(Integer firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    @JsonProperty("first_sentence")
    public List<String> getFirst_sentence() {
        return firstSentence;
    }

    @JsonProperty("first_sentence")
    public void setFirst_sentence(List<String> firstSentence) {
        this.firstSentence = firstSentence;
    }

    @JsonProperty("format")
    public List<String> getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(List<String> format) {
        this.format = format;
    }

    @JsonProperty("has_fulltext")
    public Boolean getHasFulltext() {
        return hasFulltext;
    }

    @JsonProperty("has_fulltext")
    public void setHasFulltext(Boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
    }

    @JsonProperty("ia")
    public List<String> getIa() {
        return ia;
    }

    @JsonProperty("ia")
    public void setIa(List<String> ia) {
        this.ia = ia;
    }

    @JsonProperty("ia_collection")
    public List<String> getIaCollection() {
        return iaCollection;
    }

    @JsonProperty("ia_collection")
    public void setIaCollection(List<String> iaCollection) {
        this.iaCollection = iaCollection;
    }

    @JsonProperty("ia_collection_s")
    public String getIaCollectionS() {
        return iaCollectionS;
    }

    @JsonProperty("ia_collection_s")
    public void setIaCollectionS(String iaCollectionS) {
        this.iaCollectionS = iaCollectionS;
    }

    @JsonProperty("isbn")
    public List<String> getIsbn() {
        return isbn;
    }

    @JsonProperty("isbn")
    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("language")
    public List<String> getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(List<String> language) {
        this.language = language;
    }

    @JsonProperty("last_modified_i")
    public Integer getLastModifiedI() {
        return lastModifiedI;
    }

    @JsonProperty("last_modified_i")
    public void setLastModifiedI(Integer lastModifiedI) {
        this.lastModifiedI = lastModifiedI;
    }

    @JsonProperty("lcc")
    public List<String> getLcc() {
        return lcc;
    }

    @JsonProperty("lcc")
    public void setLcc(List<String> lcc) {
        this.lcc = lcc;
    }

    @JsonProperty("lccn")
    public List<String> getLccn() {
        return lccn;
    }

    @JsonProperty("lccn")
    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    @JsonProperty("lending_edition_s")
    public String getLendingEditionS() {
        return lendingEditionS;
    }

    @JsonProperty("lending_edition_s")
    public void setLendingEditionS(String lendingEditionS) {
        this.lendingEditionS = lendingEditionS;
    }

    @JsonProperty("lending_identifier_s")
    public String getLendingIdentifierS() {
        return lendingIdentifierS;
    }

    @JsonProperty("lending_identifier_s")
    public void setLendingIdentifierS(String lendingIdentifierS) {
        this.lendingIdentifierS = lendingIdentifierS;
    }

    @JsonProperty("number_of_pages_median")
    public Integer getNumberOfPagesMedian() {
        return numberOfPagesMedian;
    }

    @JsonProperty("number_of_pages_median")
    public void setNumberOfPagesMedian(Integer numberOfPagesMedian) {
        this.numberOfPagesMedian = numberOfPagesMedian;
    }

    @JsonProperty("oclc")
    public List<String> getOclc() {
        return oclc;
    }

    @JsonProperty("oclc")
    public void setOclc(List<String> oclc) {
        this.oclc = oclc;
    }

    @JsonProperty("osp_count")
    public Integer getOspCount() {
        return ospCount;
    }

    @JsonProperty("osp_count")
    public void setOspCount(Integer ospCount) {
        this.ospCount = ospCount;
    }

    @JsonProperty("printdisabled_s")
    public String getPrintdisabledS() {
        return printdisabledS;
    }

    @JsonProperty("printdisabled_s")
    public void setPrintdisabledS(String printdisabledS) {
        this.printdisabledS = printdisabledS;
    }

    @JsonProperty("public_scan_b")
    public Boolean getPublicScanB() {
        return publicScanB;
    }

    @JsonProperty("public_scan_b")
    public void setPublicScanB(Boolean publicScanB) {
        this.publicScanB = publicScanB;
    }

    @JsonProperty("publish_date")
    public List<String> getPublishDate() {
        return publishDate;
    }

    @JsonProperty("publish_date")
    public void setPublishDate(List<String> publishDate) {
        this.publishDate = publishDate;
    }

    @JsonProperty("publish_place")
    public List<String> getPublishPlace() {
        return publishPlace;
    }

    @JsonProperty("publish_place")
    public void setPublishPlace(List<String> publishPlace) {
        this.publishPlace = publishPlace;
    }

    @JsonProperty("publish_year")
    public List<Integer> getPublishYear() {
        return publishYear;
    }

    @JsonProperty("publish_year")
    public void setPublishYear(List<Integer> publishYear) {
        this.publishYear = publishYear;
    }

    @JsonProperty("publisher")
    public List<String> getPublisher() {
        return publisher;
    }

    @JsonProperty("publisher")
    public void setPublisher(List<String> publisher) {
        this.publisher = publisher;
    }

    @JsonProperty("seed")
    public List<String> getSeed() {
        return seed;
    }

    @JsonProperty("seed")
    public void setSeed(List<String> seed) {
        this.seed = seed;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("title_suggest")
    public String getTitleSuggest() {
        return titleSuggest;
    }

    @JsonProperty("title_suggest")
    public void setTitleSuggest(String titleSuggest) {
        this.titleSuggest = titleSuggest;
    }

    @JsonProperty("title_sort")
    public String getTitleSort() {
        return titleSort;
    }

    @JsonProperty("title_sort")
    public void setTitleSort(String titleSort) {
        this.titleSort = titleSort;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id_amazon")
    public List<String> getIdAmazon() {
        return idAmazon;
    }

    @JsonProperty("id_amazon")
    public void setIdAmazon(List<String> idAmazon) {
        this.idAmazon = idAmazon;
    }

    @JsonProperty("id_better_world_books")
    public List<String> getIdBetterWorldBooks() {
        return idBetterWorldBooks;
    }

    @JsonProperty("id_better_world_books")
    public void setIdBetterWorldBooks(List<String> idBetterWorldBooks) {
        this.idBetterWorldBooks = idBetterWorldBooks;
    }

    @JsonProperty("id_goodreads")
    public List<String> getIdGoodreads() {
        return idGoodreads;
    }

    @JsonProperty("id_goodreads")
    public void setIdGoodreads(List<String> idGoodreads) {
        this.idGoodreads = idGoodreads;
    }

    @JsonProperty("id_librarything")
    public List<String> getIdLibrarything() {
        return idLibrarything;
    }

    @JsonProperty("id_librarything")
    public void setIdLibrarything(List<String> idLibrarything) {
        this.idLibrarything = idLibrarything;
    }

    @JsonProperty("id_google")
    public List<String> getIdGoogle() {
        return idGoogle;
    }

    @JsonProperty("id_google")
    public void setIdGoogle(List<String> idGoogle) {
        this.idGoogle = idGoogle;
    }

    @JsonProperty("id_scribd")
    public List<String> getIdScribd() {
        return idScribd;
    }

    @JsonProperty("id_scribd")
    public void setIdScribd(List<String> idScribd) {
        this.idScribd = idScribd;
    }

    @JsonProperty("id_amazon_de_asin")
    public List<String> getIdAmazonDeAsin() {
        return idAmazonDeAsin;
    }

    @JsonProperty("id_amazon_de_asin")
    public void setIdAmazonDeAsin(List<String> idAmazonDeAsin) {
        this.idAmazonDeAsin = idAmazonDeAsin;
    }

    @JsonProperty("id_alibris_id")
    public List<String> getIdAlibrisId() {
        return idAlibrisId;
    }

    @JsonProperty("id_alibris_id")
    public void setIdAlibrisId(List<String> idAlibrisId) {
        this.idAlibrisId = idAlibrisId;
    }

    @JsonProperty("id_nla")
    public List<String> getIdNla() {
        return idNla;
    }

    @JsonProperty("id_nla")
    public void setIdNla(List<String> idNla) {
        this.idNla = idNla;
    }

    @JsonProperty("id_amazon_ca_asin")
    public List<String> getIdAmazonCaAsin() {
        return idAmazonCaAsin;
    }

    @JsonProperty("id_amazon_ca_asin")
    public void setIdAmazonCaAsin(List<String> idAmazonCaAsin) {
        this.idAmazonCaAsin = idAmazonCaAsin;
    }

    @JsonProperty("id_overdrive")
    public List<String> getIdOverdrive() {
        return idOverdrive;
    }

    @JsonProperty("id_overdrive")
    public void setIdOverdrive(List<String> idOverdrive) {
        this.idOverdrive = idOverdrive;
    }

    @JsonProperty("id_hathi_trust")
    public List<String> getIdHathiTrust() {
        return idHathiTrust;
    }

    @JsonProperty("id_hathi_trust")
    public void setIdHathiTrust(List<String> idHathiTrust) {
        this.idHathiTrust = idHathiTrust;
    }

    @JsonProperty("id_amazon_it_asin")
    public List<String> getIdAmazonItAsin() {
        return idAmazonItAsin;
    }

    @JsonProperty("id_amazon_it_asin")
    public void setIdAmazonItAsin(List<String> idAmazonItAsin) {
        this.idAmazonItAsin = idAmazonItAsin;
    }

    @JsonProperty("id_paperback_swap")
    public List<String> getIdPaperbackSwap() {
        return idPaperbackSwap;
    }

    @JsonProperty("id_paperback_swap")
    public void setIdPaperbackSwap(List<String> idPaperbackSwap) {
        this.idPaperbackSwap = idPaperbackSwap;
    }

    @JsonProperty("id_british_national_bibliography")
    public List<String> getIdBritishNationalBibliography() {
        return idBritishNationalBibliography;
    }

    @JsonProperty("id_british_national_bibliography")
    public void setIdBritishNationalBibliography(List<String> idBritishNationalBibliography) {
        this.idBritishNationalBibliography = idBritishNationalBibliography;
    }

    @JsonProperty("id_british_library")
    public List<String> getIdBritishLibrary() {
        return idBritishLibrary;
    }

    @JsonProperty("id_british_library")
    public void setIdBritishLibrary(List<String> idBritishLibrary) {
        this.idBritishLibrary = idBritishLibrary;
    }

    @JsonProperty("id_biblioth\u00e8que_nationale_de_france")
    public List<String> getIdBibliothQueNationaleDeFrance() {
        return idBibliothQueNationaleDeFrance;
    }

    @JsonProperty("id_biblioth\u00e8que_nationale_de_france")
    public void setIdBibliothQueNationaleDeFrance(List<String> idBibliothQueNationaleDeFrance) {
        this.idBibliothQueNationaleDeFrance = idBibliothQueNationaleDeFrance;
    }

    @JsonProperty("id_amazon_co_uk_asin")
    public List<String> getIdAmazonCoUkAsin() {
        return idAmazonCoUkAsin;
    }

    @JsonProperty("id_amazon_co_uk_asin")
    public void setIdAmazonCoUkAsin(List<String> idAmazonCoUkAsin) {
        this.idAmazonCoUkAsin = idAmazonCoUkAsin;
    }

    @JsonProperty("id_bcid")
    public List<String> getIdBcid() {
        return idBcid;
    }

    @JsonProperty("id_bcid")
    public void setIdBcid(List<String> idBcid) {
        this.idBcid = idBcid;
    }

    @JsonProperty("subject")
    public List<String> getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    @JsonProperty("place")
    public List<String> getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(List<String> place) {
        this.place = place;
    }

    @JsonProperty("person")
    public List<String> getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(List<String> person) {
        this.person = person;
    }

    @JsonProperty("ia_loaded_id")
    public List<String> getIaLoadedId() {
        return iaLoadedId;
    }

    @JsonProperty("ia_loaded_id")
    public void setIaLoadedId(List<String> iaLoadedId) {
        this.iaLoadedId = iaLoadedId;
    }

    @JsonProperty("ia_box_id")
    public List<String> getIaBoxId() {
        return iaBoxId;
    }

    @JsonProperty("ia_box_id")
    public void setIaBoxId(List<String> iaBoxId) {
        this.iaBoxId = iaBoxId;
    }

    @JsonProperty("ratings_average")
    public Double getRatings_average() {
        return ratingsAverage;
    }

    @JsonProperty("ratings_average")
    public void setRatings_average(Double ratingsAverage) {
        this.ratingsAverage = ratingsAverage;
    }

    @JsonProperty("ratings_sortable")
    public Double getRatingsSortable() {
        return ratingsSortable;
    }

    @JsonProperty("ratings_sortable")
    public void setRatingsSortable(Double ratingsSortable) {
        this.ratingsSortable = ratingsSortable;
    }

    @JsonProperty("ratings_count")
    public Integer getRatings_count() {
        return ratingsCount;
    }

    @JsonProperty("ratings_count")
    public void setRatings_count(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    @JsonProperty("ratings_count_1")
    public Integer getRatingsCount1() {
        return ratingsCount1;
    }

    @JsonProperty("ratings_count_1")
    public void setRatingsCount1(Integer ratingsCount1) {
        this.ratingsCount1 = ratingsCount1;
    }

    @JsonProperty("ratings_count_2")
    public Integer getRatingsCount2() {
        return ratingsCount2;
    }

    @JsonProperty("ratings_count_2")
    public void setRatingsCount2(Integer ratingsCount2) {
        this.ratingsCount2 = ratingsCount2;
    }

    @JsonProperty("ratings_count_3")
    public Integer getRatingsCount3() {
        return ratingsCount3;
    }

    @JsonProperty("ratings_count_3")
    public void setRatingsCount3(Integer ratingsCount3) {
        this.ratingsCount3 = ratingsCount3;
    }

    @JsonProperty("ratings_count_4")
    public Integer getRatingsCount4() {
        return ratingsCount4;
    }

    @JsonProperty("ratings_count_4")
    public void setRatingsCount4(Integer ratingsCount4) {
        this.ratingsCount4 = ratingsCount4;
    }

    @JsonProperty("ratings_count_5")
    public Integer getRatingsCount5() {
        return ratingsCount5;
    }

    @JsonProperty("ratings_count_5")
    public void setRatingsCount5(Integer ratingsCount5) {
        this.ratingsCount5 = ratingsCount5;
    }

    @JsonProperty("readinglog_count")
    public Integer getReadinglogCount() {
        return readinglogCount;
    }

    @JsonProperty("readinglog_count")
    public void setReadinglogCount(Integer readinglogCount) {
        this.readinglogCount = readinglogCount;
    }

    @JsonProperty("want_to_read_count")
    public Integer getWantToReadCount() {
        return wantToReadCount;
    }

    @JsonProperty("want_to_read_count")
    public void setWantToReadCount(Integer wantToReadCount) {
        this.wantToReadCount = wantToReadCount;
    }

    @JsonProperty("currently_reading_count")
    public Integer getCurrentlyReadingCount() {
        return currentlyReadingCount;
    }

    @JsonProperty("currently_reading_count")
    public void setCurrentlyReadingCount(Integer currentlyReadingCount) {
        this.currentlyReadingCount = currentlyReadingCount;
    }

    @JsonProperty("already_read_count")
    public Integer getAlreadyReadCount() {
        return alreadyReadCount;
    }

    @JsonProperty("already_read_count")
    public void setAlreadyReadCount(Integer alreadyReadCount) {
        this.alreadyReadCount = alreadyReadCount;
    }

    @JsonProperty("publisher_facet")
    public List<String> getPublisherFacet() {
        return publisherFacet;
    }

    @JsonProperty("publisher_facet")
    public void setPublisherFacet(List<String> publisherFacet) {
        this.publisherFacet = publisherFacet;
    }

    @JsonProperty("person_key")
    public List<String> getPersonKey() {
        return personKey;
    }

    @JsonProperty("person_key")
    public void setPersonKey(List<String> personKey) {
        this.personKey = personKey;
    }

    @JsonProperty("place_key")
    public List<String> getPlaceKey() {
        return placeKey;
    }

    @JsonProperty("place_key")
    public void setPlaceKey(List<String> placeKey) {
        this.placeKey = placeKey;
    }

    @JsonProperty("person_facet")
    public List<String> getPersonFacet() {
        return personFacet;
    }

    @JsonProperty("person_facet")
    public void setPersonFacet(List<String> personFacet) {
        this.personFacet = personFacet;
    }

    @JsonProperty("subject_facet")
    public List<String> getSubjectFacet() {
        return subjectFacet;
    }

    @JsonProperty("subject_facet")
    public void setSubjectFacet(List<String> subjectFacet) {
        this.subjectFacet = subjectFacet;
    }

    @JsonProperty("_version_")
    public Long getVersion() {
        return version;
    }

    @JsonProperty("_version_")
    public void setVersion(Long version) {
        this.version = version;
    }

    @JsonProperty("place_facet")
    public List<String> getPlaceFacet() {
        return placeFacet;
    }

    @JsonProperty("place_facet")
    public void setPlaceFacet(List<String> placeFacet) {
        this.placeFacet = placeFacet;
    }

    @JsonProperty("lcc_sort")
    public String getLccSort() {
        return lccSort;
    }

    @JsonProperty("lcc_sort")
    public void setLccSort(String lccSort) {
        this.lccSort = lccSort;
    }

    @JsonProperty("author_facet")
    public List<String> getAuthorFacet() {
        return authorFacet;
    }

    @JsonProperty("author_facet")
    public void setAuthorFacet(List<String> authorFacet) {
        this.authorFacet = authorFacet;
    }

    @JsonProperty("subject_key")
    public List<String> getSubjectKey() {
        return subjectKey;
    }

    @JsonProperty("subject_key")
    public void setSubjectKey(List<String> subjectKey) {
        this.subjectKey = subjectKey;
    }

    @JsonProperty("ddc_sort")
    public String getDdcSort() {
        return ddcSort;
    }

    @JsonProperty("ddc_sort")
    public void setDdcSort(String ddcSort) {
        this.ddcSort = ddcSort;
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
