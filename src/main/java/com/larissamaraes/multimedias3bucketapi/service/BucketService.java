package com.larissamaraes.multimedias3bucketapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface BucketService {
    String uploadFile(MultipartFile multipartFile);

    String deleteFileFromS3Bucket(String fileUrl);
}
