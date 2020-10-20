import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VanlistComponent } from './vanlist.component';

describe('VanlistComponent', () => {
  let component: VanlistComponent;
  let fixture: ComponentFixture<VanlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VanlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VanlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
