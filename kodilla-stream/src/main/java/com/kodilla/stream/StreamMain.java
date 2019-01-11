package com.kodilla.stream;

import com.kodilla.stream.beautifier.ConsoleColors;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.world.Country;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.Period;
import static com.kodilla.stream.beautifier.ConsoleColors.*;
import static java.time.LocalDate.now;
import static java.util.Locale.filter;



public class StreamMain {
    public static void main(String[] args) {
        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/


        System.out.println("Poem Beautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Ala ma kota.", (text) -> text.toUpperCase());
        poemBeautifier.beautify("OLA MA PSA", (text) -> CYAN_BACKGROUND+text.toLowerCase()+ConsoleColors.RESET);
        poemBeautifier.beautify("OLA MA PSA", (text) -> RED +text+ ConsoleColors.RESET);
        poemBeautifier.beautify("ala ma kota.", (text) ->BLACK_UNDERLINED +text.substring(0, 1).toUpperCase()+ text.substring(1)+ConsoleColors.RESET) ;




       /* System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);



        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/


       /* Forum forum=new Forum();


        Map<Integer,ForumUser> theResultMapOfUsers= forum.getUserList().stream()
                .filter(s->s.getSex().equals('M'))
                .filter(s->s.getAge()>=20)
                .filter (s->s.getPostNumber()!=0)
                .collect(Collectors.toMap(ForumUser::getNumberID, forumUser -> forumUser));

        theResultMapOfUsers.entrySet().stream()
                .map(entry->entry.getKey()+": "+entry.getValue())
                .forEach(System.out::println);*/
    }




}
