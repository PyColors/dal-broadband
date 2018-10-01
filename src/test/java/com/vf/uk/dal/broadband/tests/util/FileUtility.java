package com.vf.uk.dal.broadband.tests.util;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FileUtility {

	/**
	 * Reads a file from the class path.
	 *
	 * @param filename
	 *            file name.
	 * @return file data bytes.
	 * @throws IOException
	 *             in case of I/O errors.
	 *
	 */
	public static byte[] readFile(String filename) throws IOException {
		String fileData = null;
		Resource resource = new ClassPathResource(filename);
		try (InputStream is = resource.getInputStream()) {
			byte[] fileDataBytes = new byte[is.available()];
			is.read(fileDataBytes);
			fileData = new String(fileDataBytes, "UTF-8");
		}
		return fileData.getBytes("UTF-8");
	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
