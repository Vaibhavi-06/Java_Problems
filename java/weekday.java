class Weekday {
    public static void main(String args[]) {
        int ch;
        System.out.println("1. Sunday");
        System.out.println("2. Monday");
        System.out.println("3. Tuesday");
        System.out.println("4. Wednesday");
        System.out.println("5. Thursday");
        System.out.println("6. Friday");
        System.out.println("7. Saturday");

        // Enter your choice
        ch = 3;

        switch (ch) {
            case 1:
                System.out.println("1. Sunday (Ravivāra)\n" +
                        "Planet: Sun (Surya)\n" +
                        "Deity: Surya Bhagavan (Sun God)\n\n" +
                        "Significance:\n" +
                        "Associated with vitality, health, authority, and leadership.\n" +
                        "Fasting on Sundays is believed to remove ailments, especially related to the eyes, bones, and skin.\n" +
                        "People worship Surya by offering Arghya (water) at sunrise.\n" +
                        "Considered auspicious for beginning government-related work or leadership roles.");
                break;

            case 2:
                System.out.println("2. Monday (Somavāra)\n" +
                        "Planet: Moon (Chandra)\n" +
                        "Deity: Lord Shiva\n\n" +
                        "Significance:\n" +
                        "Represents calmness, emotions, and the mind.\n" +
                        "Fasting on Mondays (Somavār Vrat) pleases Lord Shiva; popular among unmarried girls for getting a good spouse.\n" +
                        "Special worship involves offering milk, bilva leaves, and water to Shiva Linga.\n" +
                        "Considered good for starting journeys and spiritual practices.");
                break;

            case 3:
                System.out.println("3. Tuesday (Maṅgalavāra)\n" +
                        "Planet: Mars (Mangal / Kuja)\n" +
                        "Deity: Hanuman, Durga, Skanda (Kartikeya)\n\n" +
                        "Significance:\n" +
                        "Symbolizes strength, courage, and protection.\n" +
                        "People fast on Tuesdays to reduce the malefic effects of Mars (Mangal Dosh).\n" +
                        "Hanuman worship is popular on this day; red flowers and sindoor are offered.\n" +
                        "Considered good for initiating legal or property-related work.");
                break;

            case 4:
                System.out.println("4. Wednesday (Budhavāra)\n" +
                        "Planet: Mercury (Budha)\n" +
                        "Deity: Lord Vishnu, Krishna, and Budha Graha\n\n" +
                        "Significance:\n" +
                        "Represents intelligence, communication, and business.\n" +
                        "Wednesday fasts help improve memory, speech, and financial stability.\n" +
                        "Green-colored items and tulsi leaves are considered auspicious.\n" +
                        "Good day for education, trade, and resolving misunderstandings.");
                break;

            case 5:
                System.out.println("5. Thursday (Guruvāra / Brihaspativāra)\n" +
                        "Planet: Jupiter (Guru / Brihaspati)\n" +
                        "Deity: Lord Vishnu, Brihaspati (Guru), and Sai Baba (in modern practice)\n\n" +
                        "Significance:\n" +
                        "Associated with knowledge, wisdom, and prosperity.\n" +
                        "Thursday fasting brings blessings of Guru and Vishnu.\n" +
                        "Yellow is the auspicious color; devotees often offer chana dal and yellow flowers.\n" +
                        "Suitable for initiating studies, marriages, and spiritual practices.");
                break;

            case 6:
                System.out.println("6. Friday (Shukravāra)\n" +
                        "Planet: Venus (Shukra)\n" +
                        "Deity: Goddess Lakshmi, Santoshi Mata, and Shukra Graha\n\n" +
                        "Significance:\n" +
                        "Represents love, wealth, beauty, and material comforts.\n" +
                        "Friday fasting is observed for prosperity, marital happiness, and removal of poverty.\n" +
                        "White and pink are considered auspicious; devotees offer sweets and milk.\n" +
                        "Good for starting financial investments, artistic work, or housewarming.");
                break;

            case 7:
                System.out.println("7. Saturday (Shanivāra)\n" +
                        "Planet: Saturn (Shani)\n" +
                        "Deity: Shani Dev, Hanuman, and Lord Vishnu (in some traditions)\n\n" +
                        "Significance:\n" +
                        "Associated with discipline, justice, hard work, and karmic balance.\n" +
                        "Saturday fasts and prayers help reduce the malefic effects of Shani (Sade-Sati, Dhaiya).\n" +
                        "Devotees light sesame oil lamps under Peepal trees and offer black items like sesame, urad dal, and mustard oil.\n" +
                        "A day for humility, charity, and service.");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
