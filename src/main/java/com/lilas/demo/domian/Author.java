package com.lilas.demo.domian;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "tb_author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name")
	@NonNull
	private String firstName;

	@Column(name = "last_name")
	@NonNull
	private String lastName;

	@Column(name = "book_written_count")
	@NonNull
	private Integer bookWrittenCount = 0;

	@ManyToMany(mappedBy = "authorSet", fetch = FetchType.LAZY)
	@JsonIgnoreProperties("authorSet")
	private Set<Book> bookSet = new HashSet<>() ;

	public void increment(){
		bookWrittenCount++;
	}
}