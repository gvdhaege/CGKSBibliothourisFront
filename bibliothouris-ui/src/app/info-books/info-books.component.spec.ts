import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InfoBooksComponent } from './info-books.component';

describe('InfoBooksComponent', () => {
  let component: InfoBooksComponent;
  let fixture: ComponentFixture<InfoBooksComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InfoBooksComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InfoBooksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
