<!-------------------------------------------------------------->
<!--  Vue Data Binding - Lecture-Final - ProductReview.vue    -->
<!-------------------------------------------------------------->
<template>
    <div class="main">
        <h2>Product Reviews for {{ name }}</h2>

        <p class="description">{{ description }}</p>

        <div class="well-display">
            <div class="well">
                <span class="amount">{{ averageRating }}</span>  <!-- calling the averageRating method to get a value -->
                Average Rating
            </div>

            <div class="well">
                <span class="amount">{{ numberOfOneStarReviews }}</span>
                1 Star Review{{ numberOfOneStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span class="amount">{{ numberOfTwoStarReviews }}</span>
                2 Star Review{{ numberOfTwoStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span class="amount">{{ numberOfThreeStarReviews }}</span>
                3 Star Review{{ numberOfThreeStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span class="amount">{{ numberOfFourStarReviews }}</span>
                4 Star Review{{ numberOfFourStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span class="amount">{{ numberOfFiveStarReviews }}</span>
                5 Star Review{{ numberOfFiveStarReviews === 1 ? '' : 's' }}
            </div>
        </div>
        <!-- give me one of the following <div> for each item in the review array -->
        <div class="review" v-for="review in reviews" v-bind:key="review.id">
            <h4>{{ review.reviewer }}</h4>
            <div class="rating">
                <img src="../assets/star.png" v-bind:title="review.rating + ' Star Review'" class="ratingStar" v-for="n in review.rating" />
                                  <!-- adding a title to image using v-bind:title -->  <!-- give me the number of images indicated by the rating -->
            </div>
            <h3>{{ review.title }}</h3>

            <p>{{ review.review }}</p>
        </div>
    </div>
</template>

<script>
export default {
    name: "product-review",
    data() {
        return {
            name: 'Cigar Parties for Dummies',
            description: 'Host and plan the perfect cigar party for all of your squirrelly friends.',
            reviews: [
                {
                    id: 1,
                    reviewer: "Malcolm Gladwell",
                    title: 'What a book!',
                    review: "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
                    rating: 3
                },
                {
                    id: 2,
                    reviewer: "Tim Ferriss",
                    title: 'Had a cigar party started in less than 4 hours.',
                    review: "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
                    rating: 4
                },
                {
                    id: 3,
                    reviewer: "Ramit Sethi",
                    title: 'What every new entrepreneurs needs. A door stop.',
                    review: "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
                    rating: 1
                },
                {
                    id: 4,
                    reviewer: "Gary Vaynerchuk",
                    title: 'And I thought I could write',
                    review: "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
                    rating: 3
                }
            ]
        };
    },
    computed: {
        averageRating(vm) {   // vm is the component calling the method
            let sum = vm.reviews.reduce( (currentSum, review) => {
                return currentSum + review.rating;
            }, 0); // initial value in currentSum to be 0 rather than the value in the first element of teh array
            return sum / vm.reviews.length;  // divide the sum of all the star ratings by the number of reviews
        },
        numberOfOneStarReviews(vm) {
            return vm.numberOfReviews(vm.reviews, 1);  // call the numberOfReviews method passing the array of views and a number
        },                                             // the number of reviews with the rating of 1
        numberOfTwoStarReviews(vm) {
            return vm.numberOfReviews(vm.reviews, 2);  // call the numberOfReviews method passing the array of views and a number
        },                                             // the number of reviews with the rating of 2
        numberOfThreeStarReviews(vm) {
            return vm.numberOfReviews(vm.reviews, 3);  // call the numberOfReviews method passing the array of views and a number
        },                                             // the number of reviews with the rating of 3
        numberOfFourStarReviews(vm) {
            return vm.numberOfReviews(vm.reviews, 4);  // call the numberOfReviews method passing the array of views and a number
        },                                              // the number of reviews with the rating of 4
        numberOfFiveStarReviews(vm) {
            return vm.numberOfReviews(vm.reviews, 5);  // call the numberOfReviews method passing the array of views and a number
        },                                             // the number of reviews with the rating of 5
    },
    methods: {
        numberOfReviews(reviews, starType) { // receive and array and a number that represents starType
            return reviews.reduce( (currentCount, review ) => {  // currentCount is whatever the reduce returns
                return currentCount + ( review.rating === starType ? 1 : 0);  // use 1 if rating === starType, 0 otherwise
            }, 0);
        }
    }
}
</script>

<style scoped>
    div.main {
        margin: 1rem 0;
    }

    div.main div.well-display {
        display: flex;
        justify-content: space-around;
    }

    div.main div.well-display div.well {
        display: inline-block;
        width: 15%;
        border: 1px black solid;
        border-radius: 6px;
        text-align: center;
        margin: 0.25rem;
    }

    div.main div.well-display div.well span.amount {
        color: darkslategray;
        display: block;
        font-size: 2.5rem;
    }

    div.main div.review {
        border: 1px black solid;
        border-radius: 6px;
        padding: 1rem;
        margin: 10px;
    }

    div.main div.review div.rating {
        height: 2rem;
        display: inline-block;
        vertical-align: top;
        margin: 0 0.5rem;
    }

    div.main div.review div.rating img {
        height: 100%;
    }

    div.main div.review p {
        margin: 20px;
    }

    div.main h3 {
        display: inline-block;
    }

    div.main h4 {
        font-size: 1rem;
    }
</style>

