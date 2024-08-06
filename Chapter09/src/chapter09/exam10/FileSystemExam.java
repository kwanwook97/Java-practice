package chapter09.exam10;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

/* 3. 파일 시스템 특화 클래스 */
public class FileSystemExam {

	public static void main(String[] args) throws IOException {
		
		FileSystem fs = FileSystems.getDefault();
		
		Iterable<FileStore> infoList = fs.getFileStores();
		
		for (FileStore info : infoList) {
			System.out.println("드라이브 이름 : " + info.name());
			System.out.println("NTFS/FAT32 : " + info.type());
			System.out.println("전체공간 : " + (info.getTotalSpace()/1024/1024/1024) + " GB");
			System.out.println("사용가능 공간 : " + info.getUsableSpace()/1024/1024/1024 + " GB");
			System.out.println("==============================");
		}

	}

}
