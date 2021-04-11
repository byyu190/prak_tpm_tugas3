package com.examples.Tugas3;

import java.util.ArrayList;

public class LibData {
    private static String[] image = new String[] {
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/ebf3bd80-b47d-3fdb-a5d3-163f2dea0449.jpg",
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/e3e805b5-4818-302f-8de7-d2ea436227c9.jpg",
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/2163ad3a-85d2-3cbf-ba7b-078c56d14170.jpg",
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/c1cbdb84-f787-3605-87e5-828830dde039.jpg",
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/8d2f2275-0fb2-3999-885f-7ea1d7d43159.jpg",
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/29ea0180-0c74-3501-af63-3480e1f21cc6.jpg",
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/4ac3d01e-f8bd-32f5-88fc-67ad40548431.jpg",
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/68995539-cc54-3b90-8c29-5f9b73eb1315.jpg",
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/cc8247ed-b335-31f5-bf5d-0c3cc4829999.jpg",
            "https://www.momondo.com/discover/wp-content/uploads/sites/260/2015/03/f43e44bd-9688-3bc3-b837-2917e07f7dca.jpg"
    };

    private static String[] name = new String[] {
            "George Peabody Library – Baltimore, USA",
            "The National Library of China – Beijing, China",
            "Trinity College Library – Dublin, Ireland",
            "Real Gabinete Português de Leitura – Rio de Janeiro, Brazil",
            "Stuttgart City Library – Stuttgart, Germany",
            "New York Public Library – New York, USA",
            "Bibliothèque Sainte Geneviève – Paris, France",
            "Seattle Public Library – Seattle, USA",
            "National Library of the Czech Republic – Prague, Czech Republic",
            "The Royal Library – Copenhagen, Denmark"
    };

    private static String[] take = new String[] {
            "The George Peabody Library. © foreverinparadise.",
            "Beijing’s National Library of China. © IQRemix.",
            "The arched Long Room of the Trinity College Library, Dublin.",
            "The Royal Portuguese Reading Room. © Rosino.",
            "The Stuttgart City Library. © dieter_weinelt.",
            "The NYC Public Library study room. © Photographing Travis.",
            "The Bibliothèque Sainte Geneviève study hall, Paris. © jastrow75.",
            "Back to the future with the Seattle city Library. © andrewasmith.",
            "The National Library of the Czech Republic. © waitscm.",
            "Lounging by the Royal Library in Copenhagen, Denmark.",

    };

    public static String[] detail = new String[] {
            "Baltimore’s George Peabody Library is an absolute screamer! This neoclassical “cathedral of books” was completed in 1878 and houses a 300,000 volume collection dedicated mostly to the subjects of British and American art, history and literature.\n" +
                    "\n" +
                    "There’s something so helplessly romantic about old George. He boasts a five-tier atrium, with a black and white marble floor, ornamental cast-iron balconies and golden columns. No wonder it’s a popular location for weddings and special private events.",
            "With a collection of over 31 million items, the National Library of China in Beijing is the largest library in Asia. It’s not only the reading materials that impress. Inside you’ll find a four-tier study hall, which is regularly packed with tech-savvy scholars preparing for university exams.\n" +
                    "\n" +
                    "So many great minds thinking alike, yet the strictly enforced no talking library rule mean that the only sound you’ll be able to hear is the tippy-tapping of laptop keys.",
            "Step into the Long Room of Dublin’s 18th century Trinity College Library and you’ll feel like you’ve wandered onto the set of Star Wars.\n" +
                    "\n" +
                    "This 65-metre book hall shares a striking resemblance to the Jedi temple archives in 2002’s Star Wars Episode II: Attack of the Clones, with its barrel vaulted ceilings and marble busts of young Padawans-turned-Jedi Masters like Jonathan Swift, author of “Gulliver’s Travels”.\n" +
                    "\n" +
                    "Adding to the magic, the Trinity Library is home to many significant tomes, including the Book of Kells, the illuminated manuscript of the first four gospels of the New Testament, dating back to 800 AD.",
            "In 1837, Portuguese immigrants in Rio de Janeiro decided to establish a Portuguese library in their new home country. Fifty years later, their idea became reality when the Real Gabinete Português de Leitura (known in English as the Royal Portuguese Reading Room) opened its elegant doors to the masses.\n" +
                    "\n" +
                    "Featuring what is considered the largest and most valuable collection of Portuguese literature outside of the motherland, many students come from all over to take a seat in the cathedral-like reading room, with a glass dome that lets in the perfect reading light.\n" +
                    "\n" +
                    "Now considered a Brazilian landmark, the Reading Room keeps its heritage hanging on the walls both in and outside the library – with a facade made of limestone that was shipped all the way from Lisbon.",
            "Lost in Stuttgart? You won’t have trouble finding the City Library. This 9-story structure shines like a pearly glass Rubik’s cube during the day, glows during sunset, and beams with illuminated blue lights by nightfall.\n" +
                    "\n" +
                    "In sharp contrast to the cobalt hues on the outside, the library’s interior is designed almost entirely in pristine white. Remarkably, it doesn’t feel clinical, with the well-stocked rows of books and the visitors to the library bringing a splash of color and life to this modernist book emporium.",
            "New York’s Public Library system – the fourth largest in the world – is so bookish and big that it requires a jaw-dropping 93 different branches, spread out across Manhattan, the Bronx and Staten Island.\n" +
                    "\n" +
                    "Most majestic of all the institutions is the Main Branch on Fifth Avenue, which is as famous for its book collection as its cameos in popular culture, which include Ghostbusters, Breakfast at Tiffany’s and an episode of Seinfeld.\n" +
                    "\n" +
                    "Join the quiet crowd in the high-vaulted Rose Main Reading Room, with its grand chandeliers, huge windows and decorative ceiling. Be warned though, focusing on exam reading can be particularly difficult in such incredible surroundings.",
            "When Paris’ Bibliothèque Sainte Geneviève was completed in 1850, it was considered one of the world’s best cultural buildings, with its modernistic architecture and iron piping.\n" +
                    "\n" +
                    "Over 150 years later, the building might not come across as modern, but its beauty and elegance is indisputable.",
            "The Central Library branch of Seattle’s Public Library is, to put it mildly, eye-catching. Gone are the days of dusty bookshelves and drab interiors, and in its place is something that could have only ever been sent from the future.\n" +
                    "\n" +
                    "Designed by leading Dutch architect Rem Koolhaas, this futuristic structure of steel and glass features diagonal lattice panelling and an assortment of unconventional cubist angles.\n" +
                    "\n" +
                    "Opened to the public in 2004, only three years later the local landmark turned into a national treasure as it was voted #108 on The American Institute of Architects’ list of ‘150 favorite pieces of American Architecture‘.",
            "The Baroque National Library of the Czech Republic in Prague opened in 1722 and houses over 20,000 volumes of the world’s most weighty theological and medical literature.\n" +
                    "\n" +
                    "You don’t necessarily have to get on-board with the literature to be enlightened. Just take a look at the library’s ceiling frescoes depicting art and science and its collection of gilded globes. This library was built by Jesuits in the late 18th century as part of the vast Clementinum complex situated next to the Charles Bridge.",
            "Leave your preconceptions of stuffy libraries at the door, Denmark’s waterside Royal Library is a great spot to soak up some “Copenhagen cool”.\n" +
                    "\n" +
                    "Affectionately nicknamed the Black Diamond for its shiny marble facade and odd angles, this ultra modern exterior allows you to step back in time to the Old Library building via a sun-lit atrium.\n" +
                    "\n" +
                    "In the summertime, the surroundings of this black beauty are busy with loved-up couples picnicking by the water and laid-back students catching some rays with a study book in hand.\n" +
                    "\n" +
                    "Beyond the normal library features, the Black Diamond features a cafe, a Michelin-recommended waterfront restaurant, a concert hall, and three exhibition spaces, including a permanent collection on the history of Danish cartoons and The National Photography Museum.",
    };

    public static ArrayList<LibModel> getListData(){
        LibModel libModel = null;
        ArrayList<LibModel> list = new ArrayList<>();
        for(int i=0;i<image.length;i++){
            libModel = new LibModel();
            libModel.setImage(image[i]);
            libModel.setName(name[i]);
            libModel.setTake(take[i]);
            libModel.setDetail(detail[i]);
            list.add((libModel));
        }
        return list;
    }

}
