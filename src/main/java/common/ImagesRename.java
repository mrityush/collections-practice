package common;

import java.lang.*;
import java.io.File;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ImagesRename {
	public static void main(String args[]) {
		String folderpath = "/home/mrityunjaya/Desktop/desktopContents/abc_img";//targetfolderpath here folder name is abc_img
		File folder = new File(folderpath);
		File[] files = folder.listFiles();
		LocalDate today = LocalDate.now();
		LocalDate n = today;
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("YYYYMMdd");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE");
		for (File x : files) {
			if (x.isFile()) {
				String d_ate = formatter1.format(n);
				System.out.println(d_ate);
				String day = formatter2.format(n);
				n = n.plusDays(1);
				String f_name = "/home/mrityunjaya/Desktop/desktopContents/abc_img/" + d_ate + ".jpg";
				if (day.equals("Friday")) {
					n = n.plusDays(2);
				}
				File f = new File(f_name);
				x.renameTo(f);
			}

		}
		System.out.println("Sucessfulley renamed all the files!!");

	}


}