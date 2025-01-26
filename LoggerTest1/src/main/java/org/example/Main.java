package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Scanner;



class Traingle { //Pattern a
 Logger logger = LoggerFactory.getLogger(Traingle.class);


    public Traingle(int count){
        for (int rows =0; rows<= count ; rows++){
            StringBuilder rowBuilder = new StringBuilder();
            for(int column =0; column <= rows; column++){
                rowBuilder.append("#");

            }
            logger.info("{}", rowBuilder);


        }

    }
}

class UpsideDownTraingle { // Pattern b



    public UpsideDownTraingle(int count){
Logger logger = LoggerFactory.getLogger(UpsideDownTraingle.class);
        for (int rows = count; rows >= 0; rows--){
            StringBuilder rowBuilder = new StringBuilder();
            for (int column = 0; column< rows; column++){

                rowBuilder.append("#");

            }
            logger.info("{}",rowBuilder);

        }
    }
}

class UpsideDownRightTraingle { //Pattern c

    public UpsideDownRightTraingle(int count){
Logger logger = LoggerFactory.getLogger(UpsideDownRightTraingle.class);
        for(int rows = 1; rows <= count; rows++){
            StringBuilder rowBuilder = new StringBuilder();

            for (int spaces = count - rows; spaces >0 ; spaces--){
                rowBuilder.append(" ");
            }

            for (int column= 1; column <= rows; column++){

                rowBuilder.append("#");
            }

            logger.info("{}",rowBuilder);
        }

    }
}

class StairwayTraingle{ //Pattern d

Logger logger = LoggerFactory.getLogger(StairwayTraingle.class);

    public StairwayTraingle(int count){

        for (int rows = 1; rows <= count; rows++){
            StringBuilder rowBuilder = new StringBuilder();

            for (int spaces= count-rows; spaces >= 0; spaces-- ){

                rowBuilder.append(" ");

            }

            for (int colums=1; colums <= rows; colums++){
                rowBuilder.append("#");
            }


            logger.info("{}",rowBuilder);
        }
    }
}



class BoxOutline{ //Pattern e
Logger logger = LoggerFactory.getLogger(BoxOutline.class);


    public BoxOutline(int count){
        for(int rows = 1; rows <= count; rows++){
            StringBuilder rowBuilder = new StringBuilder();
            for (int column = 1; column <= count; column++){
                if ( column ==1 || rows==1|| column==count|| rows == count ){

                    rowBuilder.append("#");
                }else{
                    rowBuilder.append(" ");
                }

            }
            logger.info("{}",rowBuilder);

        }
    }
}


class ZPattern { // Pattern f


Logger logger = LoggerFactory.getLogger(ZPattern.class);
    public ZPattern(int count){
        for (int rows =1; rows <= count; rows++){
            StringBuilder rowBuilder = new StringBuilder();
            for(int column =1 ; column <= count; column++){
                if (rows == 1|| rows == count){
                    rowBuilder.append("#");
                }else if(column == (count-rows+1)){
                    rowBuilder.append("#");
                }else{

                    rowBuilder.append(" ");
                }
            }
            logger.info("{}",rowBuilder);
        }
    }
}

class ReverseZPattern{ //Pattern g
    Logger logger = LoggerFactory.getLogger(ReverseZPattern.class);

    public ReverseZPattern(int count){

        for(int rows = 1; rows <= count; rows++){
            StringBuilder rowBuilder = new StringBuilder();
            for(int column = 1; column <= count; column++){
                if (rows==1||rows==count){
                    rowBuilder.append("#");
                }else if(column == rows){
                    rowBuilder.append("#");
                }else{
                    rowBuilder.append(" ");
                }
            }
            logger.info("{}",rowBuilder.toString());
        }

    }
}


class XPattern{ //Pattern h
Logger logger = LoggerFactory.getLogger(XPattern.class);
    public XPattern(int count){
        for (int rows=1; rows<=count; rows++){
            StringBuilder rowBuilder = new StringBuilder();
            for(int colunm =1; colunm<=count; colunm++){
                if(rows==1|| rows == count){
                    rowBuilder.append("#");
                }else if(colunm==rows){
                    rowBuilder.append("#");

                }else if(colunm == (count-rows+1)){
                    rowBuilder.append("#");

                }else{
                    rowBuilder.append(" ");
                }
            }
            logger.info("{}",rowBuilder);
        }

    }
}


class XPatternBox{ //Pattern i
Logger logger = LoggerFactory.getLogger(XPatternBox.class);
    public XPatternBox(int count){
        for (int row =1; row <= count;row++ ){
            StringBuilder rowBuilder = new StringBuilder();
            for (int colunm = 1; colunm <= count; colunm++){
                if (row==1||row==count||colunm==1||colunm==count){
                    rowBuilder.append("#");
                } else if( colunm == row){
                    rowBuilder.append("#");
                }else if(colunm== (count-row+1)){
                    rowBuilder.append("#");
                }else{
                    rowBuilder.append(" ");
                }

            }
            logger.info("{}",rowBuilder);

        }
    }
}

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        logger.info("Enter a letter to select a pattern (a-i)");
        char pattern = scanner.next().charAt(0);

        logger.info("Enter the number of rows (count): ");
        int count = scanner.nextInt();

        switch (pattern) {
            case 'a':
                new Traingle(count);
                break;
            case 'b':
                new UpsideDownTraingle(count);
                break;
            case 'c':
                new UpsideDownRightTraingle(count);
                break;
            case 'd':
                new StairwayTraingle(count);
                break;
            case 'e':
                new BoxOutline(count);
                break;
            case 'f':
                new ZPattern(count);
                break;
            case 'g':
                new ReverseZPattern(count);
                break;
            case 'h':
                new XPattern(count);
                break;
            case 'i':
                new XPatternBox(count);
                break;
            default:
                logger.info("Invalid input. Please enter a letter between a-i.");


        }


        scanner.close();
    }
}