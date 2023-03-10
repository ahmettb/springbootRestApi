package com.ornekRest.iller.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

//@Data //getter setter otomatik
@Data//get-set fonksiyonları otomatik ekleniyor
@NoArgsConstructor
@AllArgsConstructor
public class il {
    @Id
    private String id;
    private Date createDate=new Date();
    private String name;
}
