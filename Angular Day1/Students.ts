import { Component , Input} from "@angular/core";

@Component({
    selector: "details",
    template: `
    <h3>Student Details</h3>
        <div>
        <ul *ngFor = "let j of names">
        <li>{{j}}</li>
        </ul>
        </div>
    `
})
export class Students{
    names = ["Sonu", "Hampi", "Bhagya"];
}