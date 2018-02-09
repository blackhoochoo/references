package com.hoochootong.references.async;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AsyncFileChannel {
	private String path;
	private String filename;
	
	public void readFileAsync() throws IOException {
		Path path = FileSystems.getDefault().getPath(this.path, filename);
		
		try (
			AsynchronousFileChannel asynchronousFileChannel = AsynchronousFileChannel.open(
					path, StandardOpenOption.READ);
		) {
			System.out.println("Asyncfilechannel 테스트 시작");
			long startTime = System.nanoTime();
			long fileSize = asynchronousFileChannel.size();
			ByteBuffer byteBuffer = ByteBuffer.allocate((int)fileSize);
		}
	}
	
	public AsyncFileChannel(String path, String filename) {
		super();
		this.path = path;
		this.filename = filename;
	}



	public AsyncFileChannel() {
		super();
	}



	public static void main(String[] args) {
		String path = args[0];
		String filename = args[1];
	}
}
