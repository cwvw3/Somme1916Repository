package com.military.charles.somme1916;

import java.util.Random;

/**
 * Created by Charles on 5/4/2015.
 */
public class FactBook {
    // Member variables (properties of the object)
    public String[] mFacts = {
            "The Battle of the Somme began on July 1, 1916.",
            "General Sir Douglas Haig was the overall British commander.",
            "General Joseph Joffre was the French commander, and the allied commander.",
            "The strategy of an attack in the area of the Somme was agreed upon at the Chantilly conference in December, 1915.",
            "The battle lasted until November 1, 1916.",
            "On the first day, the British lost 57,000 casualties.",
            "The initial artillery bombardment before the battle fired off 1.7 million shells in 7 days.",
            "Total British Commonwealth casualties were 420,000 over 4 months.",
            "The British attacked north of the Somme with 22 divisions.",
            "The French attacked south of the Somme with 5 divisions.",
            "Total killed and wounded, on all sides, was more than one million.",
            "The Germans defended their positions with 16 divisions.",
            "General Haig held three cavalry divisions in reserve, anticipating a breakthrough which never happened.",
            "The French army suffered 200,000 casualties over 4 months.",
            "The German army probably lost 465,000 casualties over 4 months.  Some estimates have been as high as 630,000.",
            "The battle was fought over a 25 mile front.",
            "The spearhead of the attack was the British Fourth Army, led by General Rawlinson.",
            "Of the 17 mines exploded beneath the German lines, the largest was the Hawthorne Crater, still visible today.",
            "The first use of tanks in the battle was on September 16, during the Battle of Fiers-Courcelette, September 15-22.",
            "Major battles fought elsewhere in 1916 were Verdun to the south and the Brusilov Offensive in the east.",
            "Many of the British troops were so-called 'Pals Battalions', recruited locally in England",
            "The first two weeks of the battle is known as the Battle of Albert, after one of the towns behind the German lines",
            "The Battle of Bazentin Ridge, July 14-17, was named after the objectives of the British Fourth Army",
            "The Battle of Fromelles, July 14-17, was a secondary attack in the south part of the battle",
            "The Battle of Delville Wood, July 14 to September 15, was on the south flank of the British positions",
            "The Battle of Poziéres, July 23 to August 7, was fought largely by Australian forces",
            "In the Battle of Ginchy, September 9, the British captured an important road junction",
            "The Battle of Guillemont, September 3-6, was fought near the junction between British and French sectors",
            "The Battle of Morval, September 25-28, was combined with a French attack on the town of Combles",
            "The final British Fourth Army offensive was the Battle of Le Transloy, October 1 to November 11",
            "The first offensive by the Reserve Army, commanded by Lt. Gen. Herbert Gough, was the Battle of Thiepval Ridge, September 26-28",
            "The Battle of Ancre Heights, October 1 to November 11, was fought by the British Third Army",
            "A large mine at Hawthorn Ridge was used to start the final British Offensive, the Battle of Ancre, November 13-18",
            "The German chief of staff, Erich von Falkenhayn, was sacked in August, because of failures at Verdun and the Somme",
            "Several months after the battle, the German forces withdrew to the shorter and more defensible Hindenberg Line,",
            "The British awarded 51 Victoria Crosses, their highest military award, for actions during the battle."
    };
    // Methods (getting things done)

    public String getFact(String old) {
        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);   // Pick a new fact
        String fact = mFacts[randomNumber];
        //Test to see if the new fact duplicates the last fact
        if (fact == old) fact = mFacts[randomNumber-1];  //If so, get another fact
        return fact;  //Return the fact
    }
}
