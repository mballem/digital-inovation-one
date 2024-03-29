import { Component, OnInit } from "@angular/core";
import { Course } from "./course";
import { CourseService } from "./course.service";

@Component({
    // removido para uso de rotas
    //selector: 'app-course-list',
    templateUrl: './course-list.component.html'
})
export class CourseListComponent implements OnInit {
    
    filteredCourses: Course[] = [];

    _courses: Course[] = [];
    
    _filterBy: string = "";

    constructor(private courseService: CourseService) {

    }

    ngOnInit(): void {
        this.retrieveAll();
    }

    retrieveAll(): void {
        this.courseService.retriveAll().subscribe({
            next: courses => {
                this._courses = courses;
                this.filteredCourses = this._courses;
            }    
        });   
        error: (err: string) => console.log('Error ', err);     
    }

    deleteById(courseId: number) : void {
        this.courseService.deleteById(courseId).subscribe({
            next: () => {
                console.log("Deleted with success");
                this.retrieveAll();
            }
        });
        error: (err: string) => console.log('Error ', err);  
    }

    set filter(value: string) {
        this._filterBy = value;

        this.filteredCourses = this._courses.filter((course: Course) => 
          course.name.toLocaleLowerCase().indexOf(this._filterBy.toLocaleLowerCase()) > -1
        );
    }

    get filter() {
        return this._filterBy;
    }
}