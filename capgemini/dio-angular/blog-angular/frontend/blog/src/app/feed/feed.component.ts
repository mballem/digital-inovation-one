import { Component, OnInit } from '@angular/core';
import { faTrashAlt } from '@fortawesome/free-regular-svg-icons';
import { Post } from '../model/Post';
import { PostService } from '../service/post.service';

@Component({
  selector: 'app-feed',
  templateUrl: './feed.component.html',
  styleUrls: ['./feed.component.css']
})
export class FeedComponent implements OnInit {

  faTrashAlt = faTrashAlt 
  posts: Post[] = [];
  post: Post = new Post;
  nome: string = "";

  constructor(private postService: PostService) { }

  ngOnInit(): void {
    this.findPosts();    
  }

  findPosts(): void {
    this.postService.getPosts().subscribe({
      next: posts => {
        this.posts = posts;
      }
    });
  }

  adicionarMensagem(): void {
    this.postService.addMensagem(this.post).subscribe({
      next: post => {
        this.post = post;
        location.assign('/feed');
      }
    });
  }

  findPostsByNome(): void {
    this.postService.getPostsByNome(this.nome).subscribe({
      next: posts => {
        this.posts = posts;
      }
    });
  }

  excluirPost(id: number): void {
    this.postService.removePostById(id).subscribe({
      next: () => {
        console.log("Deleted with success");
        this.findPosts();
      }, 
      error: err => console.log('Error ', err)
    });  
  }

  set filter(value: string) {
    console.log("filterBy: ", value)
    this.nome = value;
  }

  get filter() {
      return this.nome;
  }

}
