package booksWorks.com;

public class BooksMethods {

     String[][] booksArray = new String[2][5];
    private int i = 0;

    String[][] storeBooks(Book book) {
        if (i < booksArray.length) {
            booksArray[i][0] = book.getTitle();
            booksArray[i][1] = book.getAuthor();
            booksArray[i][2] = String.valueOf(book.getPrice());
            booksArray[i][3] = book.getPublisher();
            booksArray[i][4] = book.getISBN();
            i++;
        } else {
            System.out.println("Book array is full. Can't add more books.");
        }
        return booksArray;
    }


//    String[][] storeBooks(Book book) {
//        for(int i=0; i<booksArray.length;i++){
//            booksArray[i][0] = book.getTitle();
//            booksArray[i][1] = book.getAuthor();
//            booksArray[i][2] = String.valueOf(book.getPrice());
//            booksArray[i][3] = book.getPublisher();
//            booksArray[i][4] = book.getISBN();
//        }
//        return booksArray;
//    }

    int totalNumberOfBooks() {
        return booksArray.length;
    }

     float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i][2] != null) {
                float floatCost = Float.parseFloat(booksArray[i][2]);
                totalCost += floatCost;
            }
        }
        return totalCost;
    }

    float maxCost(){
        float max=0;
        for(int i=0;i<booksArray.length;i++){
            float fMaxCost=Float.parseFloat(booksArray[i][2]);
            if(fMaxCost>max){
                max=fMaxCost;
            }
        }
        return max;
    } float minCost(){
        float min=Integer.MAX_VALUE;
        for(int i=0;i<booksArray.length;i++){
            float fMinCost=Float.parseFloat(booksArray[i][2]);
            if(fMinCost<min){
                min=fMinCost;
            }
        }
        return min;
    }

    float averageCost(){
       return  totalCost()/totalNumberOfBooks();
    }




}
