package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {


    Map<Long,Review> reviewList = new HashMap<>();


    public ReviewRepository(){
        Review Food = new Review(1L, "Shuwa", "Lamb meat seasoned well with fresh garlic, salt, nutmeg, cumin, coriander, paprika,black pepper, and tumeric and wrapped in banana leaves buried to cook over the coals in the ground  ", "Food");
        Review Attraction = new Review(2L,"Wadis","Oman is wealthy with wadis (a low, dry valley. The term wadi is most commonly used in Arabic-speaking parts of the world. This word wadi is mainly used to describe valleys and dry creeks and riverbeds in the Middle East and North Africa. A wadi might be a stream during the rainy season and a dry ravine during the rest of the year.) There are a few that are full of water all year around, Wadi Beni Khalid is the most beautiful place I have gotten to experiance on earth.","Attraction");
        Review Lodging = new Review(3L,"Camping","Camping in Oman is taking a mat and a sleeping bag to an alcoved beach and sleeping under the stars","Lodging");
        reviewList.put(Food.getId(), Food);
        reviewList.put(Attraction.getId(),Attraction);
        reviewList.put(Lodging.getId(),Lodging);
    }



    public ReviewRepository(Review... reviewsToAdd){
        for(Review review: reviewsToAdd){
            reviewList.put(review.getId(),review);
        }


    }

    public Review findOne(Long id){
        return reviewList.get(id);

    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
