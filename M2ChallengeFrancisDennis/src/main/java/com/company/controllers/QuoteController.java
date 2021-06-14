package com.company.controllers;

import com.company.models.QuoteModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    // Random number usage/implementation from
    // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
    // also from in class activity roll the dice app by Dan Mueller
    // this instantiates the new object random
    Random rand = new Random();
    //this is our list of quotes that is acting as or database.
    private List<QuoteModel> quotesList = new ArrayList<>(
            Arrays.asList(

                    new QuoteModel(1, "Walt Disney", "The way to get started is to quit talking and begin doing."),
                    new QuoteModel(2, "Steve Jobs", "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking."),
                    new QuoteModel(3, "Dan Mueller", "It's Just Java"),
                    new QuoteModel(4, "Eleanor Roosevelt", "If life were predictable it would cease to be life, and be without flavor."),
                    new QuoteModel(5, "James Cameron", "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success."),
                    new QuoteModel(6, "John Lennon", "Life is what happens when you're busy making other plans."),
                    new QuoteModel(7, "Mother Teresa", "Spread love everywhere you go. Let no one ever come to you without leaving happier."),
                    new QuoteModel(8, "Franklin D. Roosevelt", "When you reach the end of your rope, tie a knot in it and hang on."),
                    new QuoteModel(9, "Margaret Mead", "Always remember that you are absolutely unique. Just like everyone else."),
                    new QuoteModel(10, "Benjamin Franklin", "Tell me and I forget. Teach me and I remember. Involve me and I learn.")
            )
    );

    // this maps and end point to a method that will handle requests to that endpoint.
    @GetMapping(value = "/quote")
    // this indicates the HTTP status code that is sent back when the method successfully handels the incoming request.
    @ResponseStatus(HttpStatus.OK)
    // this is the method passed to the endpoint.
    public QuoteModel getRandomQuote() {
        QuoteModel found = null;
        // Random number usage/implementation from
        // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        // also from in class activity roll the dice app by Dan Mueller
        // this loops through our list of quotes.
        for (int i = 0; i < 1; i++) {
            // we create a variable to hold the random quote index that is found
            int randomQuoteIndex = rand.nextInt(quotesList.size());
            // this takes the quote that is associated with the random index and sets it to the variable found.
            found = quotesList.get(randomQuoteIndex);

        }
        // We return the random quote
        return found;
    }


}
