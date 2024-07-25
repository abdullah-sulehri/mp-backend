package com.project.marketplace.dto;

import java.util.List;

public class AdsPageResponse {
    int totalPages;
    long totalElements;
    int pageSize;

    List<AdsDto> content;

    public AdsPageResponse(){}
    public AdsPageResponse(int totalPages, int totalElements, int pageSize, List<AdsDto> content) {
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.pageSize = pageSize;
        this.content = content;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<AdsDto> getContent() {
        return content;
    }

    public void setContent(List<AdsDto> content) {
        this.content = content;
    }
}
