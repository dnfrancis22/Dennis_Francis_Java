package com.company.controllers;

import com.company.models.AnswerModel;
import com.company.models.DefinitionModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {

    // Random number usage/implementation from
    // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
    // also from in class activity roll the dice app by Dan Mueller
    // this instantiates the new object random
    Random rand = new Random();
    //this is our list of answers that is acting as or database.
    private List<AnswerModel> answerList = new ArrayList<>(
            Arrays.asList(

                    new AnswerModel(1, "", "it is certain"),
                    new AnswerModel(2, "", "Signs point to yes"),
                    new AnswerModel(3, "", "Without a doubt"),
                    new AnswerModel(4, "", "Yes, definitely"),
                    new AnswerModel(5, "", "You may rely on it"),
                    new AnswerModel(6, "", "Signs point to no"),
                    new AnswerModel(7, "", "Most likely"),
                    new AnswerModel(8, "", "Outlook good"),
                    new AnswerModel(9, "", "Defiantly not"),
                    new AnswerModel(10, "", "Ask again later")
            )
    );

    // this maps and end point to a method that will handle requests to that endpoint.
    @PostMapping(value = "/magic")
    // this indicates the HTTP status code that is sent back when the method successfully handels the incoming request.
    @ResponseStatus(HttpStatus.CREATED)
    // this is the method passed to the endpoint.
    public AnswerModel getRandomAnswer(@RequestBody AnswerModel newAnswerModel) {
        AnswerModel found = null;
        // Random number usage/implementation from
        // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        // also from in class activity roll the dice app by Dan Mueller
        // this loops through our list of answers.
        for (int i = 0; i < 1; i++) {
            // we create a variable to hold the random answer index that is found
            int randomAnswerIndex = rand.nextInt(answerList.size());
            // this takes the answer that is associated with the random index and sets it to the variable found.
            found = answerList.get(randomAnswerIndex);

        }
        // We return the random answer
        return found;
    }


}
