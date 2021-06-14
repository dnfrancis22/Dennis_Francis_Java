package com.company.controllers;

import com.company.models.DefinitionModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class DefinitionController {

    // Random number usage/implementation from
    // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
    // also from in class activity roll the dice app by Dan Mueller
    // this instantiates the new object random
    Random rand = new Random();
    //this is our list of definitions that is acting as or database.
    private List<DefinitionModel> definitionList = new ArrayList<>(
            Arrays.asList(

                    new DefinitionModel(1, "Dough", "a mixture that consists essentially of flour or meal and a liquid (such as milk or water) and is stiff enough to knead or roll"),
                    new DefinitionModel(2, "communication", "a process by which information is exchanged between individuals through a common system of symbols, signs, or behavior"),
                    new DefinitionModel(3, "net", "an open-meshed fabric twisted, knotted, or woven together at regular intervals"),
                    new DefinitionModel(4, "gigantic", "exceeding the usual or expected (as in size, force, or prominence)"),
                    new DefinitionModel(5, "autonomy", "the quality or state of being self-governing"),
                    new DefinitionModel(6, "pronoun", "any of a small set of words (such as I, she, he, you, it, we, or they) in a language that are used as substitutes for nouns or noun phrases and whose referents are named or understood in the context"),
                    new DefinitionModel(7, "cancel culture", "the practice or tendency of engaging in mass canceling as a way of expressing disapproval and exerting social pressure"),
                    new DefinitionModel(8, "empathy", "the action of understanding, being aware of, being sensitive to, and vicariously experiencing the feelings, thoughts, and experience of another of either the past or present without having the feelings, thoughts, and experience fully communicated in an objectively explicit manner"),
                    new DefinitionModel(9, "enable", "o provide with the means or opportunity"),
                    new DefinitionModel(10, "hour", "the 24th part of a day : 60 minutes")
            )
    );

    // this maps and end point to a method that will handle requests to that endpoint.
    @GetMapping(value = "/word")
    // this indicates the HTTP status code that is sent back when the method successfully handels the incoming request.
    @ResponseStatus(HttpStatus.OK)
    // this is the method passed to the endpoint.
    public DefinitionModel getRandomDefinition() {
        DefinitionModel found = null;
        // Random number usage/implementation from
        // https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
        // also from in class activity roll the dice app by Dan Mueller
        // this loops through our list of definitions.
        for (int i = 0; i < 1; i++) {
            // we create a variable to hold the random definition index that is found
            int randomDefinitionIndex = rand.nextInt(definitionList.size());
            // this takes the definition that is associated with the random index and sets it to the variable found.
            found = definitionList.get(randomDefinitionIndex);

        }
        // We return the random definition
        return found;
    }

}
