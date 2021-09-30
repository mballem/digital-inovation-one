import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { Course } from "./course";
import { CourseService } from "./course.service";

@Component({
    templateUrl: './course-info.component.html'
})
export class CourseInfoComponent implements OnInit {
    
    course!: Course;

    // ActivatedRoute pega valores da rota ativa
    constructor(private activatedRoute: ActivatedRoute, 
                private courseService: CourseService) {       
    }

    ngOnInit(): void {
        const value = this.activatedRoute.snapshot.paramMap.get('id');
        this.courseService.retrieveById(Number(value)).subscribe({
            next: course => this.course = course,
            error: (err: string) => console.log("Error ", err)
        });
    }    

    save(): void {
        this.courseService.saveCourse(this.course).subscribe({
            next: course => console.log("Saved with success", course),
            error: err => console.log("Error ", err)            
        });    
    }
}