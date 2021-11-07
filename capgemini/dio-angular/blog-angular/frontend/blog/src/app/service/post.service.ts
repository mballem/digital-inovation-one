import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Post } from '../model/Post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  private url: string = 'http://localhost:3000/posts';

  constructor(private http: HttpClient) { }

  getPosts() {
    return this.http.get<Post[]>(this.url);
  }

  addMensagem(post: Post) {
    return this.http.post<Post>(this.url, post);   
  }

  /* Add _like to filter
   * GET /posts?nome_like=server
   */
  getPostsByNome(nome: string) {
    let params = new HttpParams().set("nome_like", nome);
    return this.http.get<Post[]>(this.url, {params: params});
  }

  removePostById(id: number) {
    return this.http.delete(this.url + "/" + id);
  }
}
