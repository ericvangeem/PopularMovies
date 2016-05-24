package com.ericvangeem.popularmovies;

/*{
    "poster_path": "/lIv1QinFqz4dlp5U4lQ6HaiskOZ.jpg",
    "adult": false,
    "overview": "Under the direction of a ruthless instructor, a talented young drummer begins to pursue perfection at any cost, even his humanity.",
    "release_date": "2014-10-10",
    "genre_ids": [
    18,
    10402
    ],
    "id": 244786,
    "original_title": "Whiplash",
    "original_language": "en",
    "title": "Whiplash",
    "backdrop_path": "/6bbZ6XyvgfjhQwbplnUh1LSj1ky.jpg",
    "popularity": 6.420909,
    "vote_count": 1857,
    "video": false,
    "vote_average": 8.34
}
*/

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public final class Movie {

    private String posterPath;
    private boolean adult;
    private String overview;
    private String releaseDate;
    private List<Integer> genreIds;
    private int id;
    private String originalTitle;
    private String originalLanguage;
    private String title;
    private String backdropPath;
    private double popularity;
    private int voteCount;
    private boolean video;
    private double voteAverage;

    private Movie(final Builder builder) {
        posterPath = builder.getPosterPath();
        adult = builder.isAdult();
        overview = builder.getOverview();
        releaseDate = builder.getReleaseDate();
        genreIds = builder.getGenreIds();
        id = builder.getId();
        originalTitle = builder.getOriginalTitle();
        originalLanguage = builder.getOriginalLanguage();
        title = builder.getTitle();
        backdropPath = builder.getBackdropPath();
        popularity = builder.getPopularity();
        voteCount = builder.getVoteCount();
        video = builder.isVideo();
        voteAverage = builder.getVoteAverage();
    }

    public static Movie fromJSONObject(final JSONObject movieJSONObject) throws JSONException {
        final JSONArray genreIdsJSONArray = movieJSONObject.getJSONArray("genre_ids");
        final List<Integer> genreIds = new ArrayList<>();
        if (genreIdsJSONArray != null) {
            for (int i = 0; i < genreIdsJSONArray.length(); i++) {
                genreIds.add(genreIdsJSONArray.getInt(i));
            }
        }

        return builder()
                .setPosterPath(movieJSONObject.getString("poster_path"))
                .setAdult(movieJSONObject.getBoolean("adult"))
                .setOverview(movieJSONObject.getString("overview"))
                .setReleaseDate(movieJSONObject.getString("release_date"))
                .setGenreIds(genreIds)
                .setId(movieJSONObject.getInt("id"))
                .setOriginalTitle(movieJSONObject.getString("original_title"))
                .setOriginalLanguage(movieJSONObject.getString("original_language"))
                .setTitle(movieJSONObject.getString("title"))
                .setBackdropPath(movieJSONObject.getString("backdrop_path"))
                .setPopularity(movieJSONObject.getDouble("popularity"))
                .setVoteCount(movieJSONObject.getInt("vote_count"))
                .setVideo(movieJSONObject.getBoolean("video"))
                .setVoteAverage(movieJSONObject.getDouble("vote_average"))
                .build();
    }

    public String getPosterPath() {
        return posterPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public int getId() {
        return id;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public double getPopularity() {
        return popularity;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public static Builder builder() {
        return new Builder();
    }

    static final class Builder {
        private String posterPath;
        private boolean adult;
        private String overview;
        private String releaseDate;
        private List<Integer> genreIds;
        private int id;
        private String originalTitle;
        private String originalLanguage;
        private String title;
        private String backdropPath;
        private double popularity;
        private int voteCount;
        private boolean video;
        private double voteAverage;

        public Builder setPosterPath(final String posterPath) {
            this.posterPath = posterPath;
            return this;
        }

        public Builder setAdult(final boolean adult) {
            this.adult = adult;
            return this;
        }

        public Builder setOverview(final String overview) {
            this.overview = overview;
            return this;
        }

        public Builder setReleaseDate(final String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setGenreIds(final List<Integer> genreIds) {
            this.genreIds = genreIds;
            return this;
        }

        public Builder setId(final int id) {
            this.id = id;
            return this;
        }

        public Builder setOriginalTitle(final String originalTitle) {
            this.originalTitle = originalTitle;
            return this;
        }

        public Builder setOriginalLanguage(final String originalLanguage) {
            this.originalLanguage = originalLanguage;
            return this;
        }

        public Builder setTitle(final String title) {
            this.title = title;
            return this;
        }

        public Builder setBackdropPath(final String backdropPath) {
            this.backdropPath = backdropPath;
            return this;
        }

        public Builder setPopularity(final double popularity) {
            this.popularity = popularity;
            return this;
        }

        public Builder setVoteCount(final int voteCount) {
            this.voteCount = voteCount;
            return this;
        }

        public Builder setVideo(final boolean video) {
            this.video = video;
            return this;
        }

        public Builder setVoteAverage(final double voteAverage) {
            this.voteAverage = voteAverage;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }

        private String getPosterPath() {
            return posterPath;
        }

        private boolean isAdult() {
            return adult;
        }

        private String getOverview() {
            return overview;
        }

        private String getReleaseDate() {
            return releaseDate;
        }

        private List<Integer> getGenreIds() {
            return genreIds;
        }

        private int getId() {
            return id;
        }

        private String getOriginalTitle() {
            return originalTitle;
        }

        private String getOriginalLanguage() {
            return originalLanguage;
        }

        private String getTitle() {
            return title;
        }

        private String getBackdropPath() {
            return backdropPath;
        }

        private double getPopularity() {
            return popularity;
        }

        private int getVoteCount() {
            return voteCount;
        }

        private boolean isVideo() {
            return video;
        }

        private double getVoteAverage() {
            return voteAverage;
        }
    }
}
