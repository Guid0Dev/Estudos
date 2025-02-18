package vetor01;

public class vetor01{

    public static void main(String[] args){

        String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        String total[] = {"31", "28", "31", "30", "31", "31", "30", "31", "30", "31", "30", "31" };

        for(int i=0; i< mes.length; i++){
            System.out.println("O mes " + mes[i] + " tem " + total[i] + " dias.");
        }
        }
    }
