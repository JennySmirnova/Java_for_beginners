//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
// Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

package Task17;

import java.io.*;

public class Task17 {
    public static void main (String args[]) {
        String str;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Вводите текстовые данные (признак конца записи - слово 'стоп')");
        try (FileWriter fw = new FileWriter("C:\\Users\\user\\IdeaProjects\\Test\\src\\Test17.txt")) {
          do  {
              System.out.print(": ");
              str = br.readLine();
              if(str.compareTo("стоп") == 0) break;
              str = str + "\r\n";
              fw.write(str); }
          while(str.compareTo("стоп") != 0);}
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc); }
        }
    }
