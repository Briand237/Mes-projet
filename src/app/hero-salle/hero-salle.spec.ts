import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeroSalle } from './hero-salle';

describe('HeroSalle', () => {
  let component: HeroSalle;
  let fixture: ComponentFixture<HeroSalle>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HeroSalle]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HeroSalle);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
