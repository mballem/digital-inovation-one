import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { CourseModule } from './courses/course.module';
import { CoreModule } from './core/core.module';
import { Error404Component } from './core/component/error-404/error-404.component';

@NgModule({
  declarations: [
    AppComponent,
    Error404Component
  ],
  imports: [
    CoreModule,
    BrowserModule,
    HttpClientModule,
    CourseModule,
    RouterModule.forRoot([
      { path: '', redirectTo: 'courses' , pathMatch: 'full' },
      { path: '**', component: Error404Component},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
