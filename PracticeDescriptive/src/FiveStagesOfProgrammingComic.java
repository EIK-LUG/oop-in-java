
//The comic: http://28.media.tumblr.com/tumblr_lhswywyafw1qzkvnjo1_500.jpg

//This file is just a description of the above comic.

class Image {

    //Square image, size in pixels
    int imageSize;
    boolean pixels[][];

    Image(int size, boolean pixelsOnOf[][]) {
        this.imageSize = size;
        pixels = pixelsOnOf;
    }

    //Etc

}

class ComicBox {

    String title;
    String text;
    Image image;

    ComicBox(String title, String text, Image image) {
        this.title = title;
        this.text = text;
        this.image = image;
    }

    //Etc

}

public class FiveStagesOfProgrammingComic {

    int nrOfBoxes = 5;
    ComicBox[] comicBoxes = new ComicBox[5];

    FiveStagesOfProgrammingComic(String[] titles, String[] texts, Image[] images) {
        for (int i = 0; i < titles.length; i++) {
            comicBoxes[i] = new ComicBox(titles[i], texts[i], images[i]);
        }
    }

    void read() {

    }

    //Etc

}
