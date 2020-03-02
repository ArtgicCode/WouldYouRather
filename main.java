package wouldyourather;

import java.util.ArrayList;
import java.util.Random;

public class main {

    static Random rand;
    static ArrayList bad;
    static ArrayList good;
    static ArrayList but;

    public static void main(String[] args) {
        rand = new Random();
        generate();
        for (int i = 0; i < 20; i++) {
            run();
        }
    }

    public static void generate() {
        generateBad();
        generateGood();
        generateBut();
    }

    public static void run() {
        int index = rand.nextInt(3);

        String text = "Would You Rather: \n";

        switch (index) {
            case 0:
                text += "[" + getBad() + "] OR [" + getBad() + "]?";
                break;
            case 1:
                text += "[" + getBad() + "] OR [" + getGood() + "] BUT [" + getBut() + "]?";
                break;
            case 2:
                text += "[" + getGood() + "] BUT [" + getBut() + "] OR [" + getGood() + "] BUT [" + getBut() + "]?";
                break;
            case 3:
                text += "[" + getGood() + "] BUT [" + getBad() + "] OR [" + getGood() + "] BUT [" + getBad() + "]?";
                break;
        }
        System.out.println(text);
    }

    public static String getBad() {
        int index = rand.nextInt(bad.size());
        return bad.get(index).toString();
    }

    public static String getGood() {
        int index = rand.nextInt(good.size());
        return good.get(index).toString();
    }

    public static String getBut() {
        int index = rand.nextInt(but.size());
        return but.get(index).toString();
    }

    private static void generateBad() {
        bad = new ArrayList<String>();
        bad.add("swim 300 meters through shit");
        bad.add("swim 300 meters through dead bodies");
        bad.add("have a dog that murders your family");
        bad.add("a family that kills all your dogs");
        bad.add("never get enjoyment from eating candy");
        bad.add("never eat turkey at Thanksgiving ever again");
        bad.add("lose the ability to lie");
        bad.add("believe everything you’re told");
        bad.add("be totally safe but only in dangerous situations");
        bad.add("be endangered in only in safe situations");
        bad.add("eat shit that tastes like chocolate");
        bad.add("look 30 years older from the neck up");
        bad.add("look 30 years older from the neck down");
        bad.add("be extremely underweight");
        bad.add("be extremely overweight");
        bad.add("have five kids and no money");
        bad.add("have infinite useless knowledge");
        bad.add("lose 10 years of your life");
        bad.add("continue a life of boredom");
        bad.add("only remember bad experiences");
        bad.add("loose the ability to nap");
        bad.add("forget all your good memories");
        bad.add("have seven toes on each foot");
        bad.add("have no one to show up for your wedding");
        bad.add("have no one show up at your funeral");
        bad.add("you are 11 inches tall");
        bad.add("have our oceans filled with piss");
        bad.add("have no one like you");
        bad.add("be forced to always speak your mind");
        bad.add("never be able to speak again");
        bad.add("be homeless");
        bad.add("know how you will die");
        bad.add("know when you will die");
        bad.add("eat your dead friends");
        bad.add("kill your dog and eat it");
        bad.add("always have a migraine");
        bad.add("increase the rate of plane crashes");
        bad.add("leave your unemployed child homeless");
        bad.add("pay for your child's drug habits and illegal activities");
        bad.add("end the life of a single human being you like");
        bad.add("end the life of 100 cute baby animals");
        bad.add("everyone is always hungry around you");
        bad.add("skinny dip with your classmates");
        bad.add("skinny dip with a stranger that has never showered");
        bad.add("give up your love life");
        bad.add("work an obligatory 100hrs a week");
        bad.add("everyone can read your mind");
        bad.add("eat only pizza for 1 year");
        bad.add("eat no pizza for 1 year");
        bad.add("visit 1000 years in the past");
        bad.add("become a cow");
        bad.add("become a chicken");
        bad.add("turn the color of the last thing you ate");
        bad.add("smell like the last food you ate forever");
        bad.add("have no taste buds");
        bad.add("be color blind");
        bad.add("eat everything you see");
        bad.add("lick everything you see");
        bad.add("have a foot long nose");
        bad.add("have a foot long tongue");
        bad.add("have a baby at the age of 10");
        bad.add("have a baby at the age of 60");
        bad.add("smell like shit");
        bad.add("look like a fish");
        bad.add("smell like a fish");
        bad.add("fight 100 duck sized horses");
        bad.add("fight 1 horse sized duck");
        bad.add("become a tree");
        bad.add("live trapped in a tree for the rest of your life");
        bad.add("lose your sense of touch");
        bad.add("lose your sense of smell");
        bad.add("lose your eye sight");
        bad.add("lose your ability to hear");
        bad.add("be Donald Trump");
        bad.add("have too many hairs in your nose");
        bad.add("be completely hairy");
        bad.add("wake up in the morning looking like a giraffe");
        bad.add("have a booger hanging from your nose for the rest of your life");
        bad.add("have earwax planted on your earlobes for the rest of your life");
        bad.add("have a sumo wrestler on top of you for a week");
        bad.add("have painful cramps");
        bad.add("live in a world that no one showers in");
        bad.add("be catcalled every day");
        bad.add("go through the whole day with a very visible panty line");
        bad.add("go the whole day with lipstick on your teeth");
        bad.add("be asked if you are PMSing every single day");
        bad.add("wear a push-up bra all day long");
        bad.add("have an entire eyebrow accidentally waxed off");
        bad.add("get a rash in a random part of your body");
        bad.add("wear a thong that keeps creeping up into your bits");
        bad.add("have tampons as fingers");
        bad.add("have pubic hair for teeth");
        bad.add("have spinach in your teeth");
        bad.add("be in jail for ten years");
        bad.add("be in a coma for 20 years");
        bad.add("have an awful hair day");
        bad.add("never have true love");
        bad.add("not be able to look at yourself again");
        bad.add("be the subject matter of gossip");
        bad.add("never being talked about at all");
        bad.add("have sex with your best friend");
        bad.add("stick a carrot in your ear");
        bad.add("do romantic things to a complete stranger");
        bad.add("try out some new kinky ideas with a stranger");
        bad.add("end a first date with an awkward kiss");
        bad.add("be caught cheating");
        bad.add("let your significant other sleep with your best friend");
        bad.add("confess your crimes in front of your children");
        bad.add("commit crimes in front of your children");
        bad.add("not brush your teeth for ten days");
        bad.add("not shower for ten days");
    }

    private static void generateGood() {
        good = new ArrayList<String>();
        good.add("have a bookcase with 9000 books");
        good.add("be the most intelligent person in the room");
        good.add("win $50,000");
        good.add("fly at 2 mph");
        good.add("be able to stop time for 10 seconds every day");
        good.add("run at 100 mph until you die");
        good.add("restart your life");
        good.add("be able to talk your way out of any situation");
        good.add("have the power to punch your way out of any situation");
        good.add("have free Wi-Fi wherever you go");
        good.add("have free coffee whenever you want");
        good.add("live a rich life");
        good.add("rule the world");
        good.add("live in a world with absolutely no problems at all");
        good.add("go back to the past and meet your loved ones who passed away");
        good.add("live the life of a king");
        good.add("be able to speak all languages");
        good.add("be able to speak only to animals");
        good.add("always know that someone is lying");
        good.add("have a billion dollars");
        good.add("end deaths caused due to car accidents");
        good.add("end hunger for everyone");
        good.add("never feel hunger again");
        good.add("live in an amusement park");
        good.add("live in a zoo as one of the animals");
        good.add("be able to read minds");
        good.add("be able to accurately predict future");
        good.add("be invisible");
        good.add("make love");
        good.add("have large assets");
        good.add("have a fantastic body");
        good.add("get in bed with your boss to get a promotion");
        good.add("be married to someone extremely attractive");
        good.add("pay to have sex");
        good.add("get paid for having sex");
        good.add("end a first date with sex");
        good.add("heal everyone in a country of your choice");
        good.add("have a great vacation");
    }

    private static void generateBut() {
        but = new ArrayList<String>();
        but.add("with a pineapple");
        but.add("no money");
        but.add("have a disfigured body");
        but.add("on a table of thorns");
        but.add("you don't have lips");
        but.add("you get aids");
        but.add("fart the whole time");
        but.add("because everyone else dies");
        but.add("see a cow twerking");
        but.add("no one cares");
    }
}
