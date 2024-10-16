package com.bookmanage.bookmanagesystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
public class BookRequests {
    private String bookNames;
    private String bookEditers;
    private Integer bookTypeid;
    private Integer startIndex;
    private Integer pageCount;
}
