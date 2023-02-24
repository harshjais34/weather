package com.example.weather;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "weatherinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class weathermodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pincode_id;
    String company_name;
    @Enumerated(value = EnumType.STRING)
    private weatherinfo Enumstatus;
    @CreationTimestamp
    private Date createdOn;

}
