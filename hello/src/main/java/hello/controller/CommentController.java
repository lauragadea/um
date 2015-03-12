package hello.controller;
import hello.Comment;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CommentController {
	

		@RequestMapping(value = "/comment", method = RequestMethod.POST)
		public ResponseEntity<Comment> get() {

				Comment com = new Comment();
				com.setCom("primer comentario");
				com.setState(1);
				
				return new ResponseEntity<Comment>(com, HttpStatus.OK);
		}
		
		//terminar metodo update
		@RequestMapping(value = "/comment/modif/{id}/{comment}", method = RequestMethod.PUT)
		public ResponseEntity<Comment> update(@RequestBody Comment m, @PathVariable("id") int id, @PathVariable("comment") String newCom){
			
			m.update (id, newCom);
			return new ResponseEntity<Comment> (m, HttpStatus.OK);
			
		}
		
		@RequestMapping(value = "/comment/modif/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<Comment> delete(@RequestBody Comment m, @PathVariable("id") int id){
			
			m.delete (id);
			return new ResponseEntity<Comment> (m, HttpStatus.OK);
			
		}
		
}
