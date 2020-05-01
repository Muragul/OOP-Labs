import java.io.*;
import java.util.*;

public class Task1b {
	public static void main(String Args[]) throws IOException, ClassNotFoundException {
		Vector <Integer> journal = new Vector <>();
		FileReader fr = new FileReader("scores.txt");
		BufferedReader br = new BufferedReader(fr);	
		
		String line = br.readLine();
		while (line != null) { 
			String [] note = line.split(" ");
			journal.add(Integer.parseInt(note[2]));
			line = br.readLine();
			} 
		br.close();
		double max=0, min=0, av, cnt=0;
		for (int n: journal) {
			if (n>max)max = n;
			if (n<min)min = n;
			cnt+=n;
		}
		av = cnt/journal.size();
		File file = new File("grades.txt");
		RandomAccessFile pw = new RandomAccessFile("grades.txt", "rw");
		pw.seek(file.length());
		pw.writeBytes("Average - "+av+"\n");
		pw.writeBytes("Maximum - "+max+"\n");
		pw.writeBytes("Minimum - "+min+"\n");
		pw.close();
		
	}

}
