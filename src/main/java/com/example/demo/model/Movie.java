package com.example.demo.model; // Đảm bảo package đúng

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "MOVIE") // Đúng với tên bảng trong H2
@Data // Tự động tạo Getter, Setter, toString, equals, hashCode
@NoArgsConstructor // Constructor không tham số
@AllArgsConstructor // Constructor có tham số
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private Integer releaseYear; // 🛠 Thay vì int, dùng Integer để tránh lỗi null

}
