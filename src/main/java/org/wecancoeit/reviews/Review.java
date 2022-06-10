package org.wecancoeit.reviews;

public class Review {

        private Long id;
        private String reviewTitle;
        private String description;
        private String category;


    public Long getId() {
        return id;
    }

    public String getReviewSubject() {
        return reviewTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }


    public Review(long id, String reviewTitle, String description, String category) {
         this.id=id;
         this.reviewTitle=reviewTitle;
         this.description=description;
         this.category=category;

    }


}
